import java.awt.*;
import java.util.Arrays;

public class main {

    public static final int COLOR_YELLOW = new Color(250, 201, 20).getRGB();
    public static final int COLOR_BLUE = new Color(17, 13, 99).getRGB();
    public static final int COLOR_RED = new Color(196, 0, 15).getRGB();
    public static final int COLOR_BLACK = new Color(5, 5, 5).getRGB();
    public static final int COLOR_WHITE = new Color(255, 255, 255).getRGB();
    public static final int COLOR_GREEN = new Color(35, 138, 51).getRGB();



    public static int [][] createCOLFlag(int height, int width){
        int [][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int)(height*0.50);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_YELLOW;
            }
        }

        rowIni = (int)(height*0.50);
        rowEnd = (int)(height*0.75);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowIni = (int)(height*0.75);
        rowEnd = (int)(height);

        for (int row = rowIni; row < rowEnd; row++){
            for (int cell = 0; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }



        return flag;
    }


    public static int [][] createVENFlag(int height, int width){
        int [][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowEnd = (int)(height*0.33);

        for (int row = rowIni; row < rowEnd; row++){
            Arrays.fill(flag[row], COLOR_YELLOW);
        }

        rowIni = (int)(height*0.33);
        rowEnd = (int)(height*0.66);

        for (int row = rowIni; row < rowEnd; row++){
            Arrays.fill(flag[row], COLOR_BLUE);
        }

        rowIni = (int)(height*0.66);
        rowEnd = (int)(height);

        for (int row = rowIni; row < rowEnd; row++){
            Arrays.fill(flag[row], COLOR_RED);
        }



        return flag;
    }
    public static void main(String[] args) {
        int [][] flag = {};

        // COLOMBIAN FLAG

        flag = createCOLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createCOLFlag(12, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createCOLFlag(24, 20 );
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createCOLFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);

        //VENEZUELAN FLAG

        flag = createVENFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(12, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(24, 20 );
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);


        //POLAND FLAG

        flag = createPOLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(12, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(24, 20 );
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);


        //VENEZUELAN FLAG

        flag = createVENFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(12, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(24, 20 );
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);


        //VENEZUELAN FLAG

        flag = createVENFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(12, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(24, 20 );
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = createVENFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
    }



}