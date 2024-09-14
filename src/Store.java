public class Store {
    public static void main(String[] args) {
        
        int cuantiesProduct1 = 2; /*Cantidad de los productos*/ 
        int cuantiesProduct2 = 3;
        int cuantiesProduct3 = 4;

        final double porcentageSales = 50; /*Porcentaje de las ventas */

        final int productPrice1 = 15; /*precio de los productos*/
        final int productPrice2 = 10; 
        final int productPrice3 = 5;

        final int[] totals = {productPrice1 * cuantiesProduct1,productPrice2 * cuantiesProduct2,productPrice3 * cuantiesProduct3};
        
        for (int lector1 = 0; lector1 < totals.length; lector1++){
            
        }

        if (totalSales > porcentageSales) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
