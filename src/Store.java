public class Store {
    public static void main(String[] args) {
        
        int cuantiesProduct1 = 2; /*Cantidad de los productos*/ 
        int cuantiesProduct2 = 3;
        int cuantiesProduct3 = 4;

        final double porcentageSales = 50; /*Porcentaje de las ventas */

        final int productPrice1 = 15; /*precio de los productos*/
        final int productPrice2 = 10; 
        final int productPrice3 = 5;

        final double[] totalSales = {productPrice1 * cuantiesProduct1,productPrice2 * cuantiesProduct2,productPrice3 * cuantiesProduct3};

        double additionSales = totalSales[0] + totalSales[1] + totalSales[2];
            System.out.println(additionSales);
            if (additionSales > porcentageSales) {
                System.out.println("Good sales performance");
            } else {
                System.out.println("Low sales performance");
            }
        for (int lector1 = 0; lector1 < totalSales.length; lector1++){
                
        }
    }
    
}
