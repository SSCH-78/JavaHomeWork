class switchStr {
  public static void main(String[] args) {

    String language = "Java";

    switch(language) {

      case "Java":
        System.out.println(language + " we are learning in QA");
        break;

      case "SQL":
        System.out.println(language + " we have learnt");
        break;

      case "Arabic":
        System.out.println(language + " will love to learn");
        break;

      default:
        System.out.println(language + " not found");
        break;
    }
  }
}