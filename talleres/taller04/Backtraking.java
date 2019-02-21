// Ejercicio #2

import java.util.LinkedList;
import java.util.Map;

public class Backtraking {

    public double shorterWayDFS(Graph g, long initNode, long endNode){

        g.dic.get(initNode).Visited();
        double pathCost = Double.MAX_VALUE;
        double path;

        if(initNode == endNode){
            return 0;
        }else{

            Points init = g.dic.get(initNode);

            if(init.arcs.isEmpty()){
                return (Double.MAX_VALUE-100)*-1;
            }


            for(int i = 0; i<init.arcs.size(); i++){

                Points point = init.arcs.get(i).getValue();

                if(point.getId() == endNode){

                    return init.arcs.get(i).getKey();

                } else if(!point.isVisited()) {

                    path = shorterWayDFS(g, point.getId(), endNode);

                    if (path >= 0) {

                        path = init.arcs.get(i).getKey()+path;

                        if(pathCost>path){

                            pathCost = path;

                        }

                    }
                }

            }


            return pathCost;


        }

    }


}
