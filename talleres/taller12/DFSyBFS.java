import java.util.*;
class Main{

  public static boolean caminoDFS(Graph g,int i,int j){
    boolean[] visitados = new boolean[g.size()];
    return hayCaminosAux(g,i,j,visitados);
  }

  private static boolean hayCaminosAux(Graph g, int i, int j, boolean[] visitados){
    visitados[i] = true:;
    if(i == j){
      return true;
    }else{
      for(integer sucesor: g.getSuccessors(i)){
        if(!visitados[sucesor]&& hayCaminoAux(g,sucesor,j,visitados)){
          return true;
        }
        return false;
      }
    }
  }

  public static boolean caminoBFS(Graph g,int i,int j){
    boolean[] visitados = new boolean[g.size()];
    Queue<Integer> cola = new LinkedList<Integer>();
    cola.add(i);
    if(i == j){
      return true;
    }else{
      while(!cola.isEmpty()){
        int actual = cola.poll();
        visitados[actual] = true;
        for(Integer sucesor : g.getSuccessors(i)){
          if(sucesor ==j){
            return true;
          }else{
            cola.add(sucesor);
          }
        }
      }
      return false;
    }
  }
}
