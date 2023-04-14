package aula11;

import java.sql.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

//    public Lista(int capacidade, Class<T> tipoClasse) {
//        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
//        this.tamanho = 0;
//    }

    public void limparLista(){

        //opção 1
//        this.elementos = (T[]) new Object[this.elementos.length];
//
//        //opção 2
//        this.tamanho = 0;

        //opção 3
        for (int i = 0; i< this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    public boolean add(T elemento){
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean add(int posicao, T elemento){

        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho-1; i >= posicao ; i--) {
            this.elementos[i +1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return false;
    }

    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento){
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho -1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    public void remove(T elemento){
        int pos = this.busca(elemento);
        if (pos > -1){
            this.remove(pos);
        }
    }

    public T obtem(int posicao){
        return (T) this.busca(posicao-1);
    }

    public int tamanho(){
        return this.tamanho;
    }

    public String turnToString() {

        StringBuilder s = new StringBuilder();
        s.append("[");


        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public boolean contem(T elemento){
        boolean contem = false;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)){
                contem = true;
                break;
            }else {
                contem = false;
            }
        }
        return contem;
    }

    public boolean contemResol(T elemento){

        int pos = busca(elemento);
        if (pos > -1){
            return true;
        }else {
            return false;
        }
//        return busca(elemento) > -1;
    }

    public int lastIndexOf(T elemento){

        for (int i=this.tamanho-1; i>=0; i--){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

}
