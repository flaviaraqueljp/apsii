
import java.util.ArrayList; 

import java.util.List; 

  

public class GerenteDeFiguras { 

    private List<FiguraGeometrica> figuras; 

  

    public GerenteDeFiguras() { 

        figuras = new ArrayList<>(); 

    } 

  

    public void adicionaFigura(FiguraGeometrica fig) { 

        figuras.add(fig); 

    } 

  

    public void imprimeFiguras() { 

        for (FiguraGeometrica f : figuras) { 

            System.out.println(f.getNomeFigura()); 

        } 

    } 

  

    public double getMaiorAreaDeFigura() { 

        double maior = 0; 

        for (FiguraGeometrica f : figuras) { 

            double area = f.calculaArea(); 

            if (area > maior) maior = area; 

        } 

        return maior; 

    } 

  

    public double calculaAreaTotalDeFiguras() { 

        double total = 0; 

        for (FiguraGeometrica f : figuras) { 

            total += f.calculaArea(); 

        } 

        return total; 

    } 

} 