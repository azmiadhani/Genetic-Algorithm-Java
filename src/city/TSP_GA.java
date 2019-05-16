/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city;

/**
 *
 * @author Oktama P.A.S
 */
public class TSP_GA {
    boolean next_status;
    public static void main(String[] args) {

        // Create and add our cities
        for(int i=0;i<=10;i++){
            int x = (int) Function.getRandomIntegerBetweenRange(1, 200);
            int y = (int) Function.getRandomIntegerBetweenRange(1, 200);
                  
            City city = new City(x, y, i);
            TourManager.addCity(city);
        }
        Function.newline();
        String what_next = "inisialisasi Populasi";
        Function.getEnter(what_next);
         Function.newline();

        
//        // Initialize population
        Population pop = new Population(3, true);
        
        System.out.println("Initial distance: " + pop.getFittest().getDistance());
//
        Function.newline();
        what_next = "mengembangkan generasi populasi ";
        Function.getEnter(what_next);
        Function.newline();
        
        // Evolve population for 1 generations
//        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 1; i++) {
            pop = GA.evolvePopulation(pop);
            System.out.println("Initial distance: " + pop);
        }
        Function.newline();
        what_next = "hasil akhir ";
        Function.getEnter(what_next);
        
//        // Print final results
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getDistance());
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
    }
}