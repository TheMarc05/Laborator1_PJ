package Laborator1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void problema1() {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int L = sc.nextInt();

        System.out.println("Perimetru: " + 2*(l+L));
        System.out.println("Aria: " + l*L);
    }

    public static void problema2() throws IOException {
        List<Integer> nr = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("src/Laborator1/in.txt"))){
            String line;
            while((line = br.readLine()) != null){
                nr.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            System.out.println("Eroare la citire" + e.getMessage());
            throw new RuntimeException(e);
        }

        int s = 0;

        int min = nr.get(0);
        int max = nr.get(0);

        for(int n : nr){
            s += n;
            if(n < min){
                min = n;
            }

            if(n > max){
                max = n;
            }
        }

        System.out.println("Suma nr: " + s);
        System.out.println("Nr minim: " + min);
        System.out.println("Nr maxim: " + max);

        double ma = (double) s / nr.size();

        System.out.println("Media aritmetica: " + ma);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/Laborator1/out.txt"))) {
            bw.write("Suma: " + s + "\n");
            bw.write("Nr minim: " + min + "\n");
            bw.write("Nr maxim: " + max + "\n");
            bw.write("Media");
        } catch (IOException e){
            System.out.println("Eroare la scriere in fisierfdfdf: " + e.getMessage());
        }
    }

    public static void problema3() {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();

        int nrD = 0;

        for (int i = 1; i <= nr; i++) {
            if(nr % i == 0){
                System.out.println(i);
                nrD++;
            }
        }

        if(nrD == 2){
            System.out.println("Numarul este prim");
        }
    }

    public static void problema4() {

    }
    public static void main(String[] args) throws IOException {
        int varianta;

        Scanner sc = new Scanner(System.in);
        varianta = sc.nextInt();

        switch(varianta){
            case 1:
                problema1();
                break;
            case 2:
                problema2();
                break;
            case 3:
                problema3();
                break;
            default:
                System.out.println("Eroare la citire");
                break;
        }
    }

}
