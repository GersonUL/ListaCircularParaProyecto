/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1algoritmos;

import Data.MovieData;
import Domain.Movie;
import java.io.IOException;

/**
 *
 * @author Pablo Rojas Martínez
 */
public class Proyecto1Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    MovieData md = new MovieData();
    Movie  movie = new Movie(1,"Gerson","Umaña",2,3,4);
        md.readFile();   
        md.insertar(movie);
    
    }
    
}
