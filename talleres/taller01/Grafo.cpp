
#include "listas.h"
#include <string>
#include <iostream>

using namespace std;

Grafo::Grafo(){
    cout<<"El grafo a sio creado"<<endl;
}

void Grafo::AddNode(){
    vector<pair<int, int>> newNode;

    if(list.size()==0){

        cout<<"Ingrese el peso de este nodo"<<endl;
        int weight;
        getline(cin,weigth);

        pair<int,int> p = make_pair(1,0);

    }
    cout<<"Digite cuantos enlaces tendra este nodo"<<endl;
    int numEnl;
    getline(cin,numEnl);
    system("cls");

    for(int i = 1; i<=numEnl; i++ ){

        int key = list.size()+1;

        if(list

        cout<<"Ingrese el peso de este nodo"<<endl;
        int weight;
        getline(cin,weigth);

        pair<int,int> par = make_pair(key,weight);

        newNode.push_back(par);
    }
}

void Grafo::getSuccesors(int node){

    if(list.size()==0 ){

        cout<<"Lista vacia. Cree el grafo"<<endl;
        AddNode();

    }else{

        for(int i = 0; i<list[node].size(); i++){
            cout<<"El nodo #"+node+" tiene enlaces con el nodo #"+list[node][i].first<<endl;
        }

    }

}

Grafo::