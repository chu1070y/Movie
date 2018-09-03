package org.zerock;


import java.util.ArrayList;

public class SimpleMovieLoader implements MovieLoader{


    @Override
    public ArrayList<Movie> getList() throws Exception {

        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("겨울왕국",123));
        list.add(new Movie("인크레더블2",100));
        list.add(new Movie("너의 이름은",121));

        return list;
    }

}
