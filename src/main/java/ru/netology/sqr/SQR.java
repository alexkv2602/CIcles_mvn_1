package ru.netology.sqr;

public class SQR {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int Quad = service.CeilQuad(200,300);
        System.out.println("Колличество квадратов=" +Quad);
        System.out.println();
    }
}
