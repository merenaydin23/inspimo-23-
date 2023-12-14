import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][]dizi=new String[7][45];
        for (int i=0;i< dizi.length;i++) {
            for (int k = 0; k < dizi[i].length; k++) {
                if (k == 2 ^ k == 8 ^ k == 15 ^ k == 21 ^ k == 27 ^ k == 29 ^ k == 32 ^ k == 42) {
                    dizi[i][k] = "*";
                } else if ((i == 0 && k == 0) ^ (i == 2 && k == 0) ^ (i == 3 && k == 0) ^ (i == 4 && k == 0) ^ (i == 5 && k == 0) ^ (i == 6 && k == 0)) {
                    dizi[i][k] = "*";
                } else if ((i == 1 && k == 3) ^ (i == 2 && k == 4) ^ (i == 3 && k == 5) ^ (i == 4 && k == 6) ^ (i == 5 && k == 7)) {
                    dizi[i][k] = "*";
                } else if ((i == 0 && k == 11) ^ (i == 0 && k == 12) ^ (i == 0 && k == 13) ^ (i == 1 && k == 10) ^ (i == 2 && k == 10) ^ (i == 3 && k == 11)) {
                    dizi[i][k] = "*";
                } else if ((i == 4 && k == 12) ^ (i == 5 && k == 12) ^ (i == 6 && k == 10) ^ (i == 6 && k == 11) ^ (i == 6 && k == 12)) {
                    dizi[i][k] = "*";
                } else if ((i == 0 && k == 16) ^ (i == 1 && k == 17) ^ (i == 2 && k == 16) ^ (i == 0 && k == 19) ^ (i == 2 && k == 19) ^ (i == 3 && k == 19)) {
                    dizi[i][k] = "*";
                } else if ((i == 4 && k == 19) ^ (i == 5 && k == 19) ^ (i == 6 && k == 19) ^ (i == 1 && k == 22) ^ (i == 2 && k == 23) ^ (i == 3 && k == 24)) {
                    dizi[i][k] = "*";
                } else if ((i == 2 && k == 25) ^ (i == 1 && k == 26) ^ (i == 0 && k == 30) ^ (i == 0 && k == 31) ^ (i == 6 && k == 30) ^ (i == 6 && k == 31)) {
                    dizi[i][k] = "*";
                } else if ((i == 0 && k == 34) ^ (i == 0 && k == 35) ^ (i == 0 && k == 36) ^ (i == 0 && k == 37) ^ (i == 1 && k == 37) ^ (i == 2 && k == 37)) {
                    dizi[i][k] = "*";
                } else if ((i == 3 && k == 37) ^ (i == 3 && k == 36) ^ (i == 3 && k == 35) ^ (i == 3 && k == 34) ^ (i == 4 && k == 34) ^ (i == 6 && k == 34)) {
                    dizi[i][k] = "*";
                } else if ((i == 5 && k == 34) ^ (i == 6 && k == 35) ^ (i == 6 && k == 36) ^ (i == 6 && k == 37) ^ (i == 0 && k == 39) ^ (i == 0 && k == 40)) {
                    dizi[i][k] = "*";
                } else if ((i == 0 && k == 41) ^ (i == 3 && k == 39) ^ (i == 3 && k == 40) ^ (i == 3 && k == 41) ^ (i == 6 && k == 39) ^ (i == 6 && k == 40) ^ (i == 6 && k == 41)) {
                    dizi[i][k] = "*";
                } else {
                    dizi[i][k] = " ";
                }
            }
        }
            for (int m=0;m< dizi.length;m++){
            for (int p=0;p<dizi[m].length;p++){
                if (p==44){
                    System.out.print(dizi[m][p]+" ");
                    System.out.println();
                        }
                else {
                    System.out.print(dizi[m][p]+" ");
                }}}}}

