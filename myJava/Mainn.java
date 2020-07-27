class Languages {

  Languages(int version1, int version2) {

    if (version1 > version2) {
      System.out.println("The latest version is: " + version1);
    }

    else {
      System.out.println("The latest version is: " + version2);
    }

  }
}

class Mainn extends Languages {

  Mainn() {
    super(11, 8);
  }

  public static void main(String[] args) {

    Mainn obj = new Mainn();

  }
}