public class vetores {
    public static void main(String[] args) {
        //vetores = arrays

        //declarando um vetor
        int vertozinho[];

        //declarando e especificando o tamanho do vetor
        int numeros[] = new int [5];

        //declarando e inicializando
        int vertorzao[] = {1,3,5,7,9};

        //outros exemplos:
        float valores[] = new float[5];
        char caracteres[];
        String nomes[];

        //Algumas práticas com arrays:
        int numeros2[] = new int[10];
        System.out.println("O tamanho do verto é: " + numeros2.length);
        for(int i = 0; i < numeros2.length; i++) {
            numeros2[i] = i + 3;
        }
        System.out.println(numeros2[0]);
        System.out.println(numeros2[9]);

        int numeros3[] = new int[10];

        for(int i = 0; i < numeros3.length; i++) {
            numeros3[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println(numeros[0]);
        System.out.println(6);
}
}
