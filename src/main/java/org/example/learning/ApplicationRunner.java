package org.example.learning;

public class ApplicationRunner {

//inheritance, method overriding, method overloading
    // Jvm nasıl calısır. işlemci (jvm) .java -> .class (bytecode) -> j
    // browserda adres satirina site ismi  yazıp entera bastıktan sonra neler oluyor.
    public static void main(String[] args) {

        BirdRunner birdRunner = new BirdRunner();
        birdRunner.doSomething();

    }
}
