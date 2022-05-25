package SubTelas.Finaceiro;

import Dao.FinaceiroDao;
import Pacotes.Financeiro;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoBruto extends JFrame {

    public GraficoBruto() {
        gerarGrafico(valores());
    }

    private String diaSemana(String date){
        try {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR")).parse(date));
            return new SimpleDateFormat("EEE", new Locale("pt", "BR")).format(gc.getTime()).toUpperCase();
        } catch (ParseException ex) {
            return null;
        }
    }
    
    private ArrayList<Financeiro> valores(){
        FinaceiroDao finaceiroDao;
        ArrayList<Financeiro> financeiro;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dia = new Date();
        String dataFormatada = formato.format(dia), semana = diaSemana(dataFormatada), comeco, fim;
        

        if(semana.equalsIgnoreCase("seg.")){ // Esse bloco de IFS são para saber qual dia é e retonar o valor certo a ser buscao
            comeco = dataFormatada;
            fim = String.valueOf(Integer.parseInt(dataFormatada.substring(0, 2)) + 5) + dataFormatada.substring(2);
        }else if(semana.equalsIgnoreCase("ter.")){
            comeco = String.valueOf(Integer.parseInt(dataFormatada.substring(0, 2)) - 1) + dataFormatada.substring(2);
            fim = String.valueOf(Integer.parseInt(dataFormatada.substring(0, 2)) + 4) + dataFormatada.substring(2);
        }else if(semana.equalsIgnoreCase("qua.")){
            comeco = String.valueOf(Integer.parseInt(dataFormatada.substring(0, 2)) - 2) + dataFormatada.substring(2);
            fim = String.valueOf(Integer.parseInt(dataFormatada.substring(0, 2)) + 3) + dataFormatada.substring(2);
        }else if(semana.equalsIgnoreCase("qui.")){
            comeco = String.valueOf(Integer.parseInt(dataFormatada.substring(0, 2)) - 3) + dataFormatada.substring(2);
            fim = String.valueOf(Integer.parseInt(dataFormatada.substring(0, 2)) + 2) + dataFormatada.substring(2);
        }else if(semana.equalsIgnoreCase("sex.")){
            comeco = String.valueOf(Integer.parseInt(dataFormatada.substring(0, 2)) - 4) + dataFormatada.substring(2);
            fim = String.valueOf(Integer.parseInt(dataFormatada.substring(0, 2)) + 1) + dataFormatada.substring(2);
        }else if(semana.equalsIgnoreCase("sáb.")){
            comeco = String.valueOf(Integer.parseInt(dataFormatada.substring(0, 2)) - 5) + dataFormatada.substring(2);
            fim = dataFormatada;
        }else{
            return null;
        }// Fim do bloco
        
        finaceiroDao = new FinaceiroDao();
        if(finaceiroDao.conectar() && !semana.equalsIgnoreCase("dom")){
            financeiro = finaceiroDao.buscar(finaceiroDao.coverterBD(comeco), finaceiroDao.coverterBD(fim));  
            finaceiroDao.desconectar();
            return financeiro;
        }else{
            return null;
        }      
    }
    
    private void gerarGrafico(ArrayList<Financeiro> financeiro){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        if(financeiro != null){
            DefaultCategoryDataset dados = new DefaultCategoryDataset();
            for(Financeiro valor : financeiro){
                if(diaSemana(formato.format(valor.getData())).equalsIgnoreCase("seg.")){
                    dados.setValue(valor.getValor(), "2022", "Seg");
                }else if(diaSemana(formato.format(valor.getData())).equalsIgnoreCase("ter.")){
                    dados.setValue(valor.getValor(), "2022", "Ter");
                }else if(diaSemana(formato.format(valor.getData())).equalsIgnoreCase("qua.")){
                    dados.setValue(valor.getValor(), "2022", "Qua");
                }else if(diaSemana(formato.format(valor.getData())).equalsIgnoreCase("qui.")){
                    dados.setValue(valor.getValor(), "2022", "Qui");
                }else if(diaSemana(formato.format(valor.getData())).equalsIgnoreCase("sex.")){
                    dados.setValue(valor.getValor(), "2022", "Sex");
                }else if(diaSemana(formato.format(valor.getData())).equalsIgnoreCase("SÁB.")){
                    dados.setValue(valor.getValor(), "2022", "Sab");
                }
            }

            JFreeChart grafico = ChartFactory.createLineChart("Lucro Bruto", "Dia", "R$", dados, PlotOrientation.VERTICAL, true, true, false);
            grafico.setBackgroundPaint(null);

            try {
                //Crio um arquivo para salvar o grafico, com a url, a largura e a altura (em px).
               ChartUtilities.saveChartAsPNG(new File("src\\view\\bruto.png"), grafico, 400, 300);
            } catch (IOException e) {
                System.err.println("Erro ao criar o grafico");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não a dados para serem exibidos");
        }
    }

    public static void testar(String args[]) {
        GraficoBruto app = new GraficoBruto();
        app.setSize(640, 480);
        app.show();
    }
}
