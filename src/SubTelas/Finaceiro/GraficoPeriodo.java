package SubTelas.Finaceiro;

import Dao.AgendaDao;
import Pacotes.Agendar;
import java.awt.Color;
import java.io.File;
import javax.swing.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class GraficoPeriodo extends JFrame {

    public GraficoPeriodo() {
        gerarGrafico();
        valores();
    }
    
    //OBS REFORMULAR ISSO URGENTE!!!
    private int[] valores(){
        //Variaveis
        ArrayList<Agendar> agendar;
        int turno[];
        AgendaDao agendaDao = new AgendaDao();
        Date diaAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        //pegando valores da tabela do banco de dados
        if(agendaDao.conectar()){
            agendar = agendaDao.buscarData(agendaDao.formatar(formato.format(diaAtual)));
            if(agendar != null){
                turno = new int[3];
                for(Agendar valor : agendar){
                    if(Integer.parseInt(valor.getHora().substring(0, 2)) <= 12 && Integer.parseInt(valor.getHora().substring(0, 2)) >= 05){
                        turno[0] ++;
                    }else if(Integer.parseInt(valor.getHora().substring(0, 2)) > 12 && Integer.parseInt(valor.getHora().substring(0, 2)) <= 17){
                        turno[1] ++;
                    }else{
                        turno[2] ++;
                    }
                }              
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel carregar valores no grafico", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                return null;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return turno;
    }
       
    private void gerarGrafico(){
        int[] valor = valores();
        
        DefaultPieDataset dados = new DefaultPieDataset();
        dados.setValue("Manha", valor[0]);
        dados.setValue("Tarde", valor[1]);
        dados.setValue("Noite", valor[2]);
        
        JFreeChart grafico = ChartFactory.createPieChart("Consultar por Periodos", dados, true, true, false);       
        grafico.setBackgroundPaint(null);
        
        PiePlot plot = (PiePlot) grafico.getPlot();
        plot.setSectionPaint(0, new Color(135, 206, 235));
        plot.setSectionPaint(1, new Color(0,191,255));
        plot.setSectionPaint(2, new Color(24, 116, 205));
        
        try {
            //Crio um arquivo para salvar o grafico, com a url, a largura e a altura (em px).
           ChartUtilities.saveChartAsPNG(new File("src\\view\\periodos.png"), grafico, 400, 300); //Cleyton
           //ChartUtilities.saveChartAsPNG(new File("C:\\Users\\rhamine.ferreira\\Documents\\Fax\\periodos.png"), grafico, 400, 300); //Rhamine
        } catch (IOException e) {
            System.err.println("Problem occurred creating chart.");
        }
        dispose();
    }
    
    public static void testar(String args[]) {
        GraficoPeriodo app = new GraficoPeriodo();
        app.setSize(640, 480);
        app.show();
    }
}