package com.sasimykyta.javacore.chapter06;


class Box {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }

   Box() {
       System.out.println("Constructing Box");
       width = 10;
       height = 10;
       depth = 10;
   }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

