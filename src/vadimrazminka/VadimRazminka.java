/*
Разминка.

Написать метод, который разворачивает строку в обратном порядке и 
замерить время работы этого метода на 1000, 10 000, 100 000 повторений.
Оформить надо в виде stand alone java приложения с консольным вводом строки.
Результатом работы должны быть строка, развернутая строка и 3 цифры (время работы).

 */
package vadimrazminka;

/**
 *
 * @author Ilya
 */
public class VadimRazminka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage java -jar VadimRazminka.jar строка_для_переварачивания");
            return;
        }
        String str = args[0];

        long time = System.currentTimeMillis();
        String res = simple(str);
        time -= System.currentTimeMillis();
        
        System.out.format("%1$s %2$s %3$3d", str, res, time);
    }
    
    /**
     * Простейшая реализация
     * @param str
     * @return 
     */
    public static String simple(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
