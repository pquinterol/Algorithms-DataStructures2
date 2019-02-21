

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Map;

public class Graph {

    String path;
    Map<Long,Points> dic;

    public Graph(String path){

        this.path = path;
        dic = new HashMap<Long,Points>();
        Read();

    }

    private void Read(){

        boolean inVer = false;
        double x,y;
        String name = "";
        System.out.println(path);

        try{

            Scanner sca = new Scanner(new File(path));


            String splitted[];
            String data;

            while(sca.hasNextLine()){

                data = sca.nextLine();
                splitted = data.split(" ");

                /*
                if(splitted.length==0){
                    data = sca.nextLine();
                    splitted = data.split(" ");
                    Scanner pr = new Scanner(System.in);
                    int a = pr.nextInt();
                }
                */

                if(splitted[0].contains("Vertices")){

                    inVer = true;
                    data = sca.nextLine();

                }else if(splitted[0].equals("Arcos.")) {

                    inVer = false;
                    data = sca.nextLine();
                    System.out.println(true);

                }

                if (inVer){


                    splitted = data.split(" ");
                    long id = Long.parseLong(splitted[0]);

                    x = Double.parseDouble(splitted[1]);
                    y = Double.parseDouble(splitted[2]);
                    //y = (Double.parseDouble(splitted[1])*2*Math.PI*6.371)/360;
                    //x = (Double.parseDouble(splitted[2])*2*Math.PI*6.371)/360;


                    if(splitted.length>3){

                        if(splitted.length==5){

                            name = splitted[3]+" "+splitted[4];

                        }else{

                            name = splitted[3];

                        }

                    }

                    dic.put(id , new Points(id, name, x, y ));
                    //System.out.println(dic.get(id).getId());


                }else{

                    try {


                        splitted = data.split(" ");

                        if(splitted.length>=3) {
                            long origin = Long.parseLong(splitted[0]);
                            long end = Long.parseLong(splitted[1]);
                            double distance = Double.parseDouble(splitted[2]);

                            if (dic.containsKey(origin)) {

                                dic.get(origin).addPoint(distance, dic.get(end));

                            }
                        }else{
                            System.out.println("Without distance");
                        }
                    }catch (NoSuchElementException e){

                        System.out.println("NotFinded");

                    }


                }

            }

            sca.close();


        }catch (FileNotFoundException ex){

            ex.printStackTrace();

        }

    }

    public void giveArcs(long id){

        dic.get(id).printArcs();

    }

    public void giveDistance(long originId, long endId){

        dic.get(originId).searchNode(endId);

    }

    public void allNodesPath(long id, double totalPathCost) {

        Points p = dic.get(id);

        if(!p.arcs.isEmpty()) {

            double minDist = p.arcs.get(0).getKey();
            long nextId = p.arcs.get(0).getValue().getId();

            for (int i = 1; i < p.arcs.size(); i++) {

                double nextDist = p.arcs.get(i).getKey();

                if (minDist > nextDist) {
                    minDist = nextDist;
                    nextId = p.arcs.get(i).getValue().getId();
                }

            }

        }else{

            System.out.println("There is no connections");

        }

    }

    public void listSize(){
        System.out.println(dic.size());
    }
}
