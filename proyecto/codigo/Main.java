class Main{
  public static void main(String[] args) {
      int dataSize = 1024 * 1024;
      Runtime runtime = Runtime.getRuntime();


      LeerDatos lectura = new LeerDatos();
      lectura.leer();
      System.out.println("memoria usada"+ (runtime.totalMemory() - runtime.freeMemory())/dataSize + "MB");

  }
}
