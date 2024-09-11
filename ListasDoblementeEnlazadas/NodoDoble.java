public class NodoDoble {
    public int dato; // Creamos el atributo "dato" que es lo que contiene el nodo
    NodoDoble siguiente, anterior; // Definimos los punteros del nodo

    // Constructor cuando existen NODOS 
    public NodoDoble(int elem, NodoDoble sig, NodoDoble ant){
        dato = elem;
        siguiente = sig;
        anterior = ant;
    }

    // Constructor cuando NO existen NODOS (ListaDoble vacía)
    public NodoDoble(int elem){
        this(elem, null, null); // Se hace llamado del constructor "Existen Nodos" dentro de este constructor
    }

    
}
