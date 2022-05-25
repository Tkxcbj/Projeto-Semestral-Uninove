
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public final class Tabela extends JFrame{
    
    public Tabela(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(100, 100);
        setLocationRelativeTo(null);
        criarGrafico();
        setVisible(true);
    }
    
    public void criarGrafico(){
        DefaultPieDataset pizza = new DefaultPieDataset();
        pizza.setValue("Aparelho", 60);
        pizza.setValue("Inplate", 50);
        pizza.setValue("estetica", 100);
        
        JFreeChart grafico = ChartFactory.createPieChart("Grafico", pizza, true, true, false);
        ChartPanel painel = new ChartPanel(grafico);
        add(painel);
    }
    
    
    public static void main(String argms[]){
        new Tabela();
    }

    

}
