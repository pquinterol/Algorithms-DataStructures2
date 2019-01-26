#ifndef listas_h
#define listas_h

#include <iostream>
#include <vector>

using namespace std;

class Grafo {

    public:
    
       Grafo();
       ~Grafo();
    
    private:
      
      vector<vector<pair<int, int>>> list;
      void AddNode();
      void getSuccesors(int node);
      int getWeight(int node);
      int dijikstra(int startNode, int endNode);


}

#endif

