PK  "wCN              META-INF/MANIFEST.MF��  �M��LK-.�K-*��ϳR0�3���� PK��      PK
    "wCN���@   @      META-INF/REFACTORINGS.XML<?xml version="1.0" encoding="UTF-8"?>
<session version="1.0"/>PK
    sz?N3z7{  {  
   .classpath<?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8"/>
	<classpathentry kind="src" path="src"/>
	<classpathentry kind="con" path="org.eclipse.jdt.junit.JUNIT_CONTAINER/5"/>
	<classpathentry kind="output" path="bin"/>
</classpath>
PK
    [n.N�r�|  |     .project<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
	<name>Teme</name>
	<comment></comment>
	<projects>
	</projects>
	<buildSpec>
		<buildCommand>
			<name>org.eclipse.jdt.core.javabuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
	</buildSpec>
	<natures>
		<nature>org.eclipse.jdt.core.javanature</nature>
	</natures>
</projectDescription>
PK
    �fCN               quizz/PK
    �uCN<�h�  �     quizz/Rectangle.javapackage quizz;
import java.util.*;

public class Rectangle implements Shapes {
	List<Rectangle> listR = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double latime;
	private double lungime;

	public Rectangle(double a, double b) {
		this.latime = a;
		this.lungime = b;		
	}
	
	public Rectangle() {
		
	}
	
	@Override
    public void addShape() {
		System.out.println("Introduceti latimea si lungimea. ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		Rectangle dreptunghi = new Rectangle (a, b);
		for (Rectangle r : listR) {
			if (r.latime == a || r.lungime == b) {
				dreptunghi = null;
				System.out.println("Similar shape is already on the list. ");
			} else { listR.add(dreptunghi);}				
		}     
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = this.latime * 2 + this.lungime * 2;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		this.surface = this.latime * this.lungime;
		return this.surface;
	}
	
	@Override
	public double totalPerimeter() {
		double totalP = 0;
		for (Rectangle r : listR) {
			totalP = totalP + r.calculatePerimeter();
		}
		return totalP;
	}
	
	@Override
	public double totalSurface() {
		double totalS = 0;
		for(Rectangle r : listR) {
			totalS = totalS + r.calculateSurface();
		}
		return totalS;
	}
	
}
PK
    �vCN����  �     quizz/Triangle.javapackage quizz;
import java.util.*;

public class Triangle implements Shapes {
	List<Triangle> listTr = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double latura1;
	private double latura2;
	private double latura3;

	public Triangle(double a, double b, double c) {
		this.latura1 = a;
		this.latura2 = b;
		this.latura3 = c;
	}
	
	public Triangle() {
		
	}
	
	@Override
	public void addShape() {
		System.out.println("Introduceti dimensiunile laturilor: ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double c = reader.nextDouble();
		Triangle triunghi = new Triangle (a, b, c);
		for (Triangle t : listTr) {
			if (t.latura1 == a || t.latura1 == b || t.latura1 == c || t.latura2 == a || t.latura2 == b || t.latura2 == c || t.latura3 == a || t.latura3 == b || t.latura3 ==c) {
				triunghi = null;
				System.out.println("Similar shape is already on the list. ");
			} else {listTr.add(triunghi);}
		}
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = this.latura1 + this.latura2 + this.latura3;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		double p = this.perimeter / 2;
		this.surface = Math.sqrt(p * (p - this.latura1) * (p - this.latura2) * (p - this.latura3));
		return this.surface;
	}
	
	@Override
	public double totalPerimeter() {
		double totalP = 0;
		for (Triangle t : listTr) {
			totalP = totalP + t.calculatePerimeter();
		}
		return totalP;
	}
	
	@Override
	public double totalSurface() {
		double totalS = 0;
		for (Triangle t : listTr) {
			totalS = totalS + t.calculateSurface();
		}
		return totalS;
	}
	
}
PK
    uCN:$�   �      quizz/DrawingTool.javapackage quizz;
import java.util.*;


public class DrawingTool {
   List<Shapes> listS = new ArrayList<>();
	public DrawingTool() {
		
	}
}


PK
    �vCNw�ȕ  �     quizz/ShapesTest.javapackage quizz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	

	@Test
	void testCalculatePerimeterRectangle() {
		double a = 10;
		double b = 7;
		Rectangle dreptunghi = new Rectangle(a, b);
		double p = dreptunghi.calculatePerimeter();
		assertEquals (34, p);		
	}
	
	@Test
	void testCalculatePerimeterSquare() {
		double a = 10;
		Square patrat = new Square(a);
		double p = patrat.calculatePerimeter();
		assertEquals (40, p);
	}
	
	@Test
	void testCalculatePerimeterCircle() {
		double a = 3;
		Circle cerc = new Circle(a);
		double p = cerc.calculatePerimeter();
		assertEquals (18.84, p);
	}
	
	@Test
	void testCalculatePerimeterTriangle() {
		double a = 3;
		double b = 5;
		double c = 4;
		Triangle triunghi = new Triangle(a, b, c);
		double p = triunghi.calculatePerimeter();
		assertEquals (12, p);
	}
	
	@Test
	void testCalculateSurfaceRectangle() {
		double a = 10;
		double b = 5;
		Rectangle dreptunghi = new Rectangle(a, b);
		double s = dreptunghi.calculateSurface();
		assertEquals(50, s);
	}
	
	@Test
	void testCalculateSurfaceSquare() {
		double a = 10;
		Square patrat = new Square(a);
		double s = patrat.calculateSurface();
		assertEquals(100, s);
	}
	
	@Test
	void testCalculateSurfaceCircle() {
		double a = 10;
		Circle cerc = new Circle(a);
		double s = cerc.calculateSurface();
		assertEquals(314, s);
	}
	
	@Test
	void testCalculateSurfaceTriangle() {
		double a = 5;
		double b = 4;
		double c = 3;
		Triangle triunghi = new Triangle(a, b, c);
		double s = triunghi.calculateSurface();
		assertEquals(6, s);
	}

}
PK
    tCN�|��  �     quizz/Circle.javapackage quizz;
import java.util.*;

public class Circle implements Shapes {
	List<Circle> listC = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double raza;

	public Circle(double a) {
		this.raza = a;
	}
	
	public Circle() {
		
	}
	
	@Override
	public void addShape() {
		System.out.println("Introduceti raza: ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		Circle cerc = new Circle(a);
		for (Circle c : listC) {
			if (c.raza == a) {
				cerc = null;
				System.out.println("Similar shape is already on the list. ");
			} else {listC.add(cerc);}
		}
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = 2 * 3.14 * this.raza;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		this.surface = 3.14 * this.raza * this.raza;
		return this.surface;
	}
	
	@Override
	public double totalPerimeter() {
		double totalP = 0;
		for (Circle c : listC) {
			totalP = totalP + c.calculatePerimeter();
		}
		return totalP;
	}
	
	@Override
	public double totalSurface() {
		double totalS = 0;
		for (Circle c : listC) {
			totalS = totalS + c.calculateSurface();
		}
		return totalS;
	}
	
}
PK
    tCN�<O��  �     quizz/Square.javapackage quizz;
import java.util.*;

public class Square implements Shapes {
	List<Square> listSq = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double latura;

	public Square(double a) {
		this.latura = a;		
	}
	
	public Square() {
		
	}
	
	@Override
	public void addShape() {
		System.out.println("Introduceti latura: ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		Square patrat = new Square(a);
		for (Square s : listSq) {
			if (s.latura == a) {
				patrat = null;
				System.out.println("Similar shape is already on the list. ");
			} else {listSq.add(patrat);}
		}
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = 4 * this.latura;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		this.surface = this.latura * this.latura;
		return this.surface;
	}
	
	@Override
	public double totalPerimeter() {
		double totalP = 0;
		for (Square s : listSq) {
			totalP = totalP + s.calculatePerimeter();
		}
		return totalP;
	}
	
	@Override
	public double totalSurface() {
		double totalS = 0;
		for (Square s : listSq) {
			totalS = totalS + s.calculateSurface();
		}
		return totalS;
	}
	
}
PK
    srCN�,L�   �      quizz/Shapes.javapackage quizz;
import java.util.*;

public interface Shapes {
	void addShape();
	double calculatePerimeter();
	double calculateSurface();
	double totalPerimeter();
	double totalSurface();
}


PK
    tCN�$��f  f     quizz/Circle.class����   4 n  quizz/Circle  java/lang/Object  quizz/Shapes listC Ljava/util/List; 	Signature  Ljava/util/List<Lquizz/Circle;>; 	perimeter D surface raza <init> (D)V Code
     ()V  java/util/ArrayList
  	    	     LineNumberTable LocalVariableTable this Lquizz/Circle; a addShape	 # % $ java/lang/System & ' out Ljava/io/PrintStream; ) Introduceti raza: 
 + - , java/io/PrintStream . / println (Ljava/lang/String;)V 1 java/util/Scanner	 # 3 4 5 in Ljava/io/InputStream;
 0 7  8 (Ljava/io/InputStream;)V
 0 : ; < 
nextDouble ()D
  >   @ B A java/util/List C D iterator ()Ljava/util/Iterator; F H G java/util/Iterator I J next ()Ljava/lang/Object; L &Similar shape is already on the list.  @ N O P add (Ljava/lang/Object;)Z F R S T hasNext ()Z reader Ljava/util/Scanner; cerc c StackMapTable calculatePerimeter@�Q�	  ^   calculateSurface@	�Q�	  c   totalPerimeter
  f Z < totalP totalSurface
  j _ < totalS 
SourceFile Circle.java !           	    
                        U     *� *� Y� � *'� �           
                                 B     *� *� Y� � �                             !     .     k� "(� *� 0Y� 2� 6L+� 9I� Y(� =:*� � ? :� 3� E � :� (�� :� "K� *� *� � M W� Q ��ɱ       .           "  <  F  I  Q  `  j     4    k      X U V   S     " I W   < $ X   Y   C � 0   0   F  � #   0   F  �    0   F    Z <     ?     * [*� k� ]*� ]�       
    "  #              _ <     D     * `*� k*� k� b*� b�       
    (  )              d <     �     .H*� � ? :� � E � N'-� ecH� Q ���'�           .  /  0 " / , 2         .      , g     X   Y    �     F    h <     �     .H*� � ? :� � E � N'-� icH� Q ���'�           7  8  9 " 8 , ;         .      , k     X   Y    �     F    l    mPK
    uCN��@�  �     quizz/DrawingTool.class����   4   quizz/DrawingTool  java/lang/Object listS Ljava/util/List; 	Signature  Ljava/util/List<Lquizz/Shapes;>; <init> ()V Code
   	 
  java/util/ArrayList
  	     LineNumberTable LocalVariableTable this Lquizz/DrawingTool; 
SourceFile DrawingTool.java !                  	 
     B     *� *� Y� � �               	                  PK
    �uCN� �  �     quizz/Rectangle.class����   4 p  quizz/Rectangle  java/lang/Object  quizz/Shapes listR Ljava/util/List; 	Signature #Ljava/util/List<Lquizz/Rectangle;>; 	perimeter D surface latime lungime <init> (DD)V Code
     ()V  java/util/ArrayList
  	    	    	     LineNumberTable LocalVariableTable this Lquizz/Rectangle; a b addShape	 ' ) ( java/lang/System * + out Ljava/io/PrintStream; - !Introduceti latimea si lungimea. 
 / 1 0 java/io/PrintStream 2 3 println (Ljava/lang/String;)V 5 java/util/Scanner	 ' 7 8 9 in Ljava/io/InputStream;
 4 ;  < (Ljava/io/InputStream;)V
 4 > ? @ 
nextDouble ()D
  B   D F E java/util/List G H iterator ()Ljava/util/Iterator; J L K java/util/Iterator M N next ()Ljava/lang/Object; P &Similar shape is already on the list.  D R S T add (Ljava/lang/Object;)Z J V W X hasNext ()Z reader Ljava/util/Scanner; 
dreptunghi r StackMapTable calculatePerimeter@       	  b   calculateSurface	  e   totalPerimeter
  h ^ @ totalP totalSurface
  l c @ totalS 
SourceFile Rectangle.java !           	    
                             h     *� *� Y� � *'� *)� �                              ! "      #      $          B     *� *� Y� � �                         ! "    %     S  	   ~� &,� .� 4Y� 6� :L+� =I+� =9� Y(� A:*� � C :� >� I � :� (�� � �� :� &O� .� *� � Q W� U ����       2             *  D  Y  \  d  s  } !     >    ~ ! "    k Y Z   f #    ` $   * T [ "  D / \ "  ]   G � 8   4   J  �     4   J  �    4   J    ^ @     H     **�  _k*�  _kc� a*� a�       
    %  &          ! "    c @     @     **� *� k� d*� d�       
    +  ,          ! "    f @     �     .H*� � C :� � I � N'-� gcH� U ���'�           1  2  3 " 2 , 5          . ! "    , i     \ "  ]    �     J    j @     �     .H*� � C :� � I � N'-� kcH� U ���'�           :  ;  < " ; , >          . ! "    , m     \ "  ]    �     J    n    oPK
    srCN����   �      quizz/Shapes.class����   4   quizz/Shapes  java/lang/Object addShape ()V calculatePerimeter ()D calculateSurface totalPerimeter totalSurface 
SourceFile Shapes.java                	    
             PK
    �vCNwW�BS	  S	     quizz/ShapesTest.class����   4 f  quizz/ShapesTest  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lquizz/ShapesTest; testCalculatePerimeterRectangle RuntimeVisibleAnnotations Lorg/junit/jupiter/api/Test;@$      @        quizz/Rectangle
     (DD)V
     calculatePerimeter ()D@A      
 ! # "  org/junit/jupiter/api/Assertions $  assertEquals a D b 
dreptunghi Lquizz/Rectangle; p testCalculatePerimeterSquare - quizz/Square
 , /  0 (D)V
 , @D       patrat Lquizz/Square; testCalculatePerimeterCircle@       : quizz/Circle
 9 /
 9 @2�
=p�� cerc Lquizz/Circle; testCalculatePerimeterTriangle@      @       G quizz/Triangle
 F I  J (DDD)V
 F @(       c triunghi Lquizz/Triangle; testCalculateSurfaceRectangle
  S T  calculateSurface@I       s testCalculateSurfaceSquare
 , S@Y       testCalculateSurfaceCircle
 9 S@s�      testCalculateSurfaceTriangle
 F S@       
SourceFile ShapesTest.java         	         /     *� �    
                                    �     # H J� Y')� :� 9 �  �    
                "     4    #       % &    ' &    ( )   	 * &    +              t      H� ,Y'� .N-� 19 2�  �    
                   *           % &    4 5   	 * &    6              t      7H� 9Y'� ;N-� <9 =�  �    
                !    *           % &    ? @   	 * &    A              �  
   * 7H BJ D9� FY')� H:� K9 L�  �    
       %  &  '  (  ) ! * ) +    >    *      & % &   " ' &    N &    O P  ! 	 * &    Q              �     # H BJ� Y')� :� R9 U�  �    
       /  0  1  2  3 " 4    4    #       % &    ' &    ( )   	 W &    X              t      H� ,Y'� .N-� Y9 Z�  �    
       8  9  :  ;  <    *           % &    4 5   	 W &    \              t      H� 9Y'� ;N-� ]9 ^�  �    
       @  A  B  C  D    *           % &    ? @   	 W &    `              �  
   * BH DJ 79� FY')� H:� a9 b�  �    
       H  I  J  K  L ! M ) N    >    *      & % &   " ' &    N &    O P  ! 	 W &   d    ePK
    tCN]DQ`  `     quizz/Square.class����   4 l  quizz/Square  java/lang/Object  quizz/Shapes listSq Ljava/util/List; 	Signature  Ljava/util/List<Lquizz/Square;>; 	perimeter D surface latura <init> (D)V Code
     ()V  java/util/ArrayList
  	    	     LineNumberTable LocalVariableTable this Lquizz/Square; a addShape	 # % $ java/lang/System & ' out Ljava/io/PrintStream; ) Introduceti latura: 
 + - , java/io/PrintStream . / println (Ljava/lang/String;)V 1 java/util/Scanner	 # 3 4 5 in Ljava/io/InputStream;
 0 7  8 (Ljava/io/InputStream;)V
 0 : ; < 
nextDouble ()D
  >   @ B A java/util/List C D iterator ()Ljava/util/Iterator; F H G java/util/Iterator I J next ()Ljava/lang/Object; L &Similar shape is already on the list.  @ N O P add (Ljava/lang/Object;)Z F R S T hasNext ()Z reader Ljava/util/Scanner; patrat s StackMapTable calculatePerimeter@      	  ^   calculateSurface	  a   totalPerimeter
  d Z < totalP totalSurface
  h _ < totalS 
SourceFile Square.java !           	    
                        U     *� *� Y� � *'� �           
                                 B     *� *� Y� � �                             !     .     k� "(� *� 0Y� 2� 6L+� 9I� Y(� =:*� � ? :� 3� E � :� (�� :� "K� *� *� � M W� Q ��ɱ       .           "  <  F  I  Q  `  j     4    k      X U V   S     " I W   < $ X   Y   C � 0   0   F  � #   0   F  �    0   F    Z <     ?     * [*� k� ]*� ]�       
    "  #              _ <     @     **� *� k� `*� `�       
    (  )              b <     �     .H*� � ? :� � E � N'-� ccH� Q ���'�           .  /  0 " / , 2         .      , e     X   Y    �     F    f <     �     .H*� � ? :� � E � N'-� gcH� Q ���'�           7  8  9 " 8 , ;         .      , i     X   Y    �     F    j    kPK
    �vCN}���	  �	     quizz/Triangle.class����   4 {  quizz/Triangle  java/lang/Object  quizz/Shapes listTr Ljava/util/List; 	Signature "Ljava/util/List<Lquizz/Triangle;>; 	perimeter D surface latura1 latura2 latura3 <init> (DDD)V Code
     ()V  java/util/ArrayList
  	    	    	    	  !   LineNumberTable LocalVariableTable this Lquizz/Triangle; a b c addShape	 + - , java/lang/System . / out Ljava/io/PrintStream; 1 $Introduceti dimensiunile laturilor: 
 3 5 4 java/io/PrintStream 6 7 println (Ljava/lang/String;)V 9 java/util/Scanner	 + ; < = in Ljava/io/InputStream;
 8 ?  @ (Ljava/io/InputStream;)V
 8 B C D 
nextDouble ()D
  F   H J I java/util/List K L iterator ()Ljava/util/Iterator; N P O java/util/Iterator Q R next ()Ljava/lang/Object; T &Similar shape is already on the list.  H V W X add (Ljava/lang/Object;)Z N Z [ \ hasNext ()Z reader Ljava/util/Scanner; triunghi t StackMapTable calculatePerimeter	  d   calculateSurface@       
 i k j java/lang/Math l m sqrt (D)D	  o   p totalPerimeter
  s b D totalP totalSurface
  w e D totalS 
SourceFile Triangle.java !           	    
                                  |      *� *� Y� � *'� *)� *�  �    "                  #   *      $ %       &       '       (          B     *� *� Y� � �    "            #        $ %    )     �     Ѳ *0� 2� 8Y� :� >L+� AI+� A9+� A9� Y(� E:*� � G :
� �
� M � :		� (�� Y	� �� N	� �� C	� (�� 9	� �� .	� �� #	�  (�� 	�  �� 	�  �� :� *S� 2� *� � U W
� Y ��s�    "   6             $  2  L  �   � ! � " �  � $ #   H    � $ %    � ] ^   � &    � '   $ � (   2 � _ %  L z ` % 	 a   J � @   8   N  � k   8   N  �    8   N    b D     E     **� *� c*�  c� c*� c�    "   
    (  ) #        $ %    e D     g     +*� c foH*''*� gk'*� gk'*�  gk� h� n*� n�    "       . 	 / & 0 #       + $ %   	 " p    q D     �     .H*� � G :� � M � N'-� rcH� Y ���'�    "       5  6  7 " 6 , 9 #        . $ %    , t     ` %  a    �     N    u D     �     .H*� � G :� � M � N'-� vcH� Y ���'�    "       >  ?  @ " ? , B #        . $ %    , x     ` %  a    �     N    y    zPK
     aCN               testing/PK
     aCN               testing/homework/PK
     aCN^$�%       testing/homework/Matrice.class����   4   testing/homework/Matrice  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ltesting/homework/Matrice; 
SourceFile Matrice.java !               3     *� �    
   
                        PK
     aCN`�!9
  9
     testing/homework/Metode.class����   4 u  testing/homework/Metode  java/lang/Object matrice [[I <clinit> ()V Code 	     LineNumberTable LocalVariableTable <init>
     this Ltesting/homework/Metode; indexOfCharacter '(Ljava/lang/String;Ljava/lang/String;)I	    java/lang/System   out Ljava/io/PrintStream;  java/lang/StringBuilder  3Indexul caracterului selectat din String str este: 
  !  " (Ljava/lang/String;)V
 $ & % java/lang/String ' ( indexOf (Ljava/lang/String;)I
  * + , append (I)Ljava/lang/StringBuilder;
  . / 0 toString ()Ljava/lang/String;
 2 4 3 java/io/PrintStream 5 " println cuvant Ljava/lang/String; caracter checkPalindrome (Ljava/lang/String;)Z
 $ < = > length ()I @  
 $ B C D valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 $ F G H charAt (I)C
  J + K (C)Ljava/lang/StringBuilder;
 $ M N O equals (Ljava/lang/Object;)Z Q Cuvantul este un palindrom.  S Cuvantul nu este un palindrom.  lungime I invers i StackMapTable MatriceEngine (II)V rows columns initMatrice _ java/util/Random
 ^ 
 ^ b c d nextInt (I)I j maxDiagPrincipala�    max maxDiagSecundara maxDiagonale
  l f >
  n i > 
principala 	secundara sumDiagonalaPrincipala sum 
SourceFile Metode.java !           
     	   *      
� 
� �           "           	   3     *� �       
                       	   X      � � Y�  *+� #� )� -� 1*+� #�       
                6 7       8 7   9 :  	   �     I*� ;<?Md>� � Y,� A�  *� E� I� -M�����*,� L� � P� 1�� R� 1�       * 
          &  -  5  =  ?  G     *    I 6 7    D T U   A V 7   ! W U  X    �  $�   Y Z  	   L     
� 
� �       
    % 	 &         
       
 [ U    
 \ U   ]   	   �     .;� &<� � 2� ^Y� `
� aO���� ��۱           )  * 
 +  * % ) - .       + W U     e U  X    � � �   f >  	   |     %g;<� � 2.� � 2.;�����           1  2  3  4  2 # 7       " h U     W U  X   	 �   i >  	   �     /g;� �d<=� � 2.� � 2.;�������       "    ;  < 
 =  >  ? " A % = - C        , h U   
 % e U   ! W U  X   
 �   j >  	   �     g;� k<� m=� ;� ;�       "    G  H  I  J  K  L  M  O         h U     o U    p U  X   	 �   q >  	   m     ;<� � 2.`;�����           S  T  U  T  W        r U     W U  X    �   s    tPK
     aCN��,�  �     testing/homework/TestTema.class����   4 L  testing/homework/TestTema  java/lang/Object test Ltesting/homework/Metode; <init> ()V Code
      testing/homework/Metode
  	     LineNumberTable LocalVariableTable this Ltesting/homework/TestTema; checkPalindromeTest RuntimeVisibleAnnotations Lorg/junit/jupiter/api/Test;  cojoc
    java/lang/String   length ()I
  ! " # checkPalindrome (Ljava/lang/String;)Z
 % ' & java/lang/Boolean ( ) valueOf (Z)Ljava/lang/Boolean;
 + - ,  org/junit/jupiter/api/Assertions . / assertEquals '(Ljava/lang/Object;Ljava/lang/Object;)V cuvant Ljava/lang/String; I rezultat Z indexOfCharacterTest 7 irlanda 9 a
  ; < = indexOfCharacter '(Ljava/lang/String;Ljava/lang/String;)I
 + ? . @ (II)V caracter maxDiagonalaPrincipalaTest
  D E  initMatrice
  G H  maxDiagPrincipala maax 
SourceFile TestTema.java !                	   B     *� 
*� Y� � �             
                           	   q     L+� =+�  >� $� $� *�                       *           0 1     2    3 4   5           	   j     6L8M+,� :>� >�                       *           0 1    A 1    3 2   B           	   N     � C� F<	� >�           #  $  %  &               I 2   J    KPK
     aCN               videostore/PK
     aCN               videostore/tema/PK
     aCN4���  �     videostore/tema/VideoMenu.class����   4 c  videostore/tema/VideoMenu  java/lang/Object <init> ()V Code
  	    
The_Matrix
    videostore/tema/VideoStore   addVideo (Ljava/lang/String;)V  Godfather_II   Star_Wars_Episode_IV:_A_New_Hope	    java/lang/System   out Ljava/io/PrintStream;  Welcome!
  !   java/io/PrintStream "  println $ 1. List available videos. & 2. Check out title. ( 3. Return title. * 4. Add new title. , 5. Exit. . Select desired option:  0 java/util/Scanner	  2 3 4 in Ljava/io/InputStream;
 / 6  7 (Ljava/io/InputStream;)V
 / 9 : ; nextInt ()I
  = >  viewAvailable @ *Type in the movie title you want to rent: 
 / B C D next ()Ljava/lang/String;
  F G  checkOut I +Type in the movie title you are returning: 
  K L  checkIn N -Enter the title of the video you want added:  LineNumberTable LocalVariableTable this Lvideostore/tema/VideoMenu; x Z reader Ljava/util/Scanner; option I reader2 title Ljava/lang/String; reader3 title1 reader1 name StackMapTable 
SourceFile VideoMenu.java !              +  
   �*� 
� � � <� � � � #� � %� � '� � )� � +� � -� � /Y� 1� 5M,� 8>�     �         #   )   L   o   �� <� n� ?� � /Y� 1� 5:� A:� E� K� H� � /Y� 1� 5:� A:� J� (� M� � /Y� 1� 5:� A:		� � <��"�    O   � $     
 	             (  0  8  @  H  P  [  `  �  �  � ! � " � # � $ � % � ' � ( � ) � * � + � - � . � / � 0 � 1 � 3 �  � 8 P   f 
   � Q R    � S T  [ � U V  ` � W X  �  Y V  �  Z [  �  \ V  �  ] [  �  ^ V  �  _ [ 	 `    �     � k /"""�   a    bPK
     aCN,�r�  �  &   videostore/tema/VideoStore$Video.class����   4 -   videostore/tema/VideoStore$Video  java/lang/Object title Ljava/lang/String; 	available Z rating F i I <init> (Ljava/lang/String;)V Code
     ()V	    	   	 
	    	     LineNumberTable LocalVariableTable this "Lvideostore/tema/VideoStore$Video; getName ()Ljava/lang/String; toString
  #    receiveRating (I)V givenRating 
SourceFile VideoStore.java InnerClasses + videostore/tema/VideoStore Video                   	 
                 j     *� *� *� *� *+� *� �              	                                    /     *� �                         !       /     *� "�                          $ %     X     *Y� `� **� �b*� �n� �           # 
 $  %                &    '    ( )   
   * , PK
     aCN7���
  �
      videostore/tema/VideoStore.class����   4 �  videostore/tema/VideoStore  java/lang/Object videos Ljava/util/List; 	Signature 4Ljava/util/List<Lvideostore/tema/VideoStore$Video;>; <clinit> ()V Code  java/util/ArrayList
    
 <init>	     LineNumberTable LocalVariableTable
   this Lvideostore/tema/VideoStore; viewAvailable    java/util/List   iterator ()Ljava/util/Iterator;   " ! java/util/Iterator # $ next ()Ljava/lang/Object; &  videostore/tema/VideoStore$Video	 ( * ) java/lang/System + , out Ljava/io/PrintStream; . java/lang/StringBuilder
 % 0 1 2 toString ()Ljava/lang/String;
 4 6 5 java/lang/String 7 8 valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 - :  ; (Ljava/lang/String;)V =  // Average rating: 
 - ? @ A append -(Ljava/lang/String;)Ljava/lang/StringBuilder;	 % C D E rating F
 - G @ H (F)Ljava/lang/StringBuilder; J  // Number of views: 	 % L M N i I
 - P @ Q (I)Ljava/lang/StringBuilder; S  // Available: 	 % U V W 	available Z
 - Y @ Z (Z)Ljava/lang/StringBuilder;
 - 0
 ] _ ^ java/io/PrintStream ` ; println   b c d hasNext ()Z video "Lvideostore/tema/VideoStore$Video; StackMapTable addVideo
 % :  k l m add (Ljava/lang/Object;)Z title Ljava/lang/String; checkOut	 % r n o
 4 t u m equals w Enjoy viewing  y !Title is currently not available. checkIn | ^Thank you for returning the video. Please leave an integer rating between 1-10 for the movie:  ~ java/util/Scanner	 ( � � � in Ljava/io/InputStream;
 } �  � (Ljava/io/InputStream;)V
 } � � � nextInt ()I
 % � � � receiveRating (I)V reader4 Ljava/util/Scanner; givenRating 
SourceFile VideoStore.java InnerClasses Video !      	           	 
     +      � Y� � �           *         
     3     *� �       
    	                 
     �     [� �  L� H+�  � %K� '� -Y*� /� 3� 9<� >*� B� FI� >*� K� OR� >*� T� X� [� \+� a ����           0  1 Q 0 Z 3       ; e f   g    �       � D  h ;     @     � � %Y*� i� j W�       
    7  8         n o    p ;     �     j� �  M� W,�  � %L+� q*� s� (+� T� !+� T� '� -Yv� 9*� >� [� \� +� q*� s� +� T� � 'x� \,� a ����       "    <  = ( > - ? C @ X A ` < i D        j n o    J e f  g   . �   4     � 9  4 %    �   4       z ;     �     V� �  M� C,�  � %L+� q*� s� .+� T� '+� T� '{� \� }Y� � �N-� �6+� �,� a ����       & 	   H  I ( J - K 5 L @ M F N L H U Q    *    V n o    6 e f  @  � �  F  � N  g    �   4     ?  �    � �   
  %  � PK
     aCN�D�    (   videostore/tema/VideoStoreLauncher.class����   4   "videostore/tema/VideoStoreLauncher  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this $Lvideostore/tema/VideoStoreLauncher; main ([Ljava/lang/String;)V  videostore/tema/VideoMenu
  	 args [Ljava/lang/String; menu Lvideostore/tema/VideoMenu; 
SourceFile VideoStoreLauncher.java !               3     *� �    
   
                   	       A     	� Y� L�    
   
    
          	               PK   "wCN��                      META-INF/MANIFEST.MF��  PK
 
    "wCN���@   @                a   META-INF/REFACTORINGS.XMLPK
 
    sz?N3z7{  {  
             �   .classpathPK
 
    [n.N�r�|  |               {  .projectPK
 
    �fCN                           quizz/PK
 
    �uCN<�h�  �               A  quizz/Rectangle.javaPK
 
    �vCN����  �               +
  quizz/Triangle.javaPK
 
    uCN:$�   �                9  quizz/DrawingTool.javaPK
 
    �vCNw�ȕ  �                 quizz/ShapesTest.javaPK
 
    tCN�|��  �               �  quizz/Circle.javaPK
 
    tCN�<O��  �               �  quizz/Square.javaPK
 
    srCN�,L�   �                #  quizz/Shapes.javaPK
 
    tCN�$��f  f               $  quizz/Circle.classPK
 
    uCN��@�  �               �,  quizz/DrawingTool.classPK
 
    �uCN� �  �               v.  quizz/Rectangle.classPK
 
    srCN����   �                �7  quizz/Shapes.classPK
 
    �vCNwW�BS	  S	               �8  quizz/ShapesTest.classPK
 
    tCN]DQ`  `               (B  quizz/Square.classPK
 
    �vCN}���	  �	               �J  quizz/Triangle.classPK
 
     aCN                         �T  testing/PK
 
     aCN                         �T  testing/homework/PK
 
     aCN^$�%                 	U  testing/homework/Matrice.classPK
 
     aCN`�!9
  9
               aV  testing/homework/Metode.classPK
 
     aCN��,�  �               �`  testing/homework/TestTema.classPK
 
     aCN                         �f  videostore/PK
 
     aCN                         �f  videostore/tema/PK
 
     aCN4���  �               �f  videostore/tema/VideoMenu.classPK
 
     aCN,�r�  �  &             �m  videostore/tema/VideoStore$Video.classPK
 
     aCN7���
  �
                �q  videostore/tema/VideoStore.classPK
 
     aCN�D�    (             v|  videostore/tema/VideoStoreLauncher.classPK      �  �~    