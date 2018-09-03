package org.zerock;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception{

//        Movie[] movies = {
//                new Movie("명량",17615314),
//                new Movie("신과함께",14410931),
//                new Movie("국제시장",14262766),
//                new Movie("베테랑",13414200),
//                new Movie("아바타",13338863)
//        };
//
//        Arrays.sort(movies);
//        System.out.println(Arrays.toString(movies));

//        MovieLoader loader = new SimpleMovieLoader();
        MovieLoader loader = new KoreanMovieLoader();
//        MovieLoader loader = new NetworkLoader();
        MovieUI ui = new MovieUI(loader);
        ui.printList();


    }
}
