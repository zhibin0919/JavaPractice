package bean;

public class Transcript{
   private int id;
   private String name;
   private String sex;
   private int Chinese;
   private int Math;
   private int English;
   public Transcript(int id, String name, String sex, int Chinese, int Math, int English) {
      super();
      this.id = id;
      this.name = name;
      this.sex = sex;
      this.Chinese = Chinese;
      this.Math = Math;
      this.English = English;
   }
   public int getId() {
	  return id;
   }
   public String getName() {
      return name;
   }
   public String getSex() {
	  return sex;
   }
   public int getChinese() {
      return Chinese;
   }
   public int getMath() {
      return Math;
   }
   public int getEnglish() {
      return English;
   }
}