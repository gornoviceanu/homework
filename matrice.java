PK  2�AN              META-INF/MANIFEST.MF��  �M��LK-.�K-*��ϳR0�3���� PK��      PK
    2�AN���@   @      META-INF/REFACTORINGS.XML<?xml version="1.0" encoding="UTF-8"?>
<session version="1.0"/>PK
    ��AN               testing/PK
    ��AN               testing/homework/PK
    ��AN��<�   �      testing/homework/Matrice.javapackage testing.homework;

public class Matrice {

	public Matrice() {
		// TODO Auto-generated constructor stub
	}

}
PK
    �AN��4  4     testing/homework/TestTema.javapackage testing.homework;

import static org.junit.jupiter.api.Assertions.*;
import static java.lang.System.*;

import org.junit.jupiter.api.Test;

public class TestTema {
	
	private Metode test = new Metode();
	
	@Test
	public void checkPalindromeTest () {
		String cuvant = "cojoc";
		int length = cuvant.length();
		boolean rezultat = Metode.checkPalindrome(cuvant);
		assertEquals(true, rezultat);
	}
	
	@Test
	public void indexOfCharacterTest () {
		String cuvant = "irlanda";
		String caracter = "a";
		int rezultat;
		rezultat = Metode.indexOfCharacter(cuvant, caracter);
		assertEquals(3, rezultat);
	}
	
	
	

	
	@Test
	public void maxDiagonalaPrincipalaTest() {	
        Metode.initMatrice();
		int maax = Metode.maxDiagPrincipala();
		assertEquals(9, maax);
	}




}
PK
    �ANd+잁  �     testing/homework/Metode.javapackage testing.homework;
import java.util.Random;

public class Metode {

	public Metode() {
		
	}
	
	static int indexOfCharacter(String cuvant, String caracter) {
		System.out.println("Indexul caracterului selectat din String str este: " + cuvant.indexOf(caracter));
		return cuvant.indexOf(caracter);
	}
	
	static boolean checkPalindrome(String cuvant) {
		int lungime = cuvant.length();
		String invers = "";
		
		for (int i = lungime - 1; i >= 0; i--) {
			invers = invers + cuvant.charAt(i);
		}
		
		if (cuvant.equals(invers)) {
			System.out.println("Cuvantul este un palindrom. ");
			return true;
		}
		else { System.out.println("Cuvantul nu este un palindrom. ");	
		    return false;
		}
	}
	
	
	
    static int[][] matrice = new int[5][5];
    
    public void MatriceEngine (int rows, int columns) {
    	matrice = new int[rows][columns];
    }
    
    static void initMatrice() {
    	for (int i = 0; i < 5; i++) {
    		for (int j = 0; j < 5; j++) {
    			matrice[i][j] = new Random().nextInt(10);
    		}
    	}
    }
	
	static int maxDiagPrincipala() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			if (matrice[i][i] > max) {
				max = matrice[i][i];
			}
		}
		return max;
	}
	
	static int maxDiagSecundara() {
		int max = Integer.MIN_VALUE;
		int j = matrice.length - 1;
		for (int i = 0; i < 5; i++) {
			if(matrice[i][j] > max) {
				max = matrice[i][j];
			}
			j--;
		}
		return max;
	}
	
	static int maxDiagonale() {
		int max = Integer.MIN_VALUE;
		int principala = maxDiagPrincipala();
		int secundara = maxDiagSecundara();
		if (principala >= secundara) {
			max = principala;
		}
		else { max = secundara;
		}
		return max;
	}
	
	static int sumDiagonalaPrincipala() {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = matrice[i][i] + sum;
		}
		return sum;
	}
	
	
	


}
PK
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
    ��AN^$�%       testing/homework/Matrice.class����   4   testing/homework/Matrice  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ltesting/homework/Matrice; 
SourceFile Matrice.java !               3     *� �    
   
                        PK
    �AN`�!9
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
    �AN��,�  �     testing/homework/TestTema.class����   4 L  testing/homework/TestTema  java/lang/Object test Ltesting/homework/Metode; <init> ()V Code
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
    sz?N               videostore/PK
    sz?N               videostore/tema/PK
    sz?N4���  �     videostore/tema/VideoMenu.class����   4 c  videostore/tema/VideoMenu  java/lang/Object <init> ()V Code
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
    sz?N,�r�  �  &   videostore/tema/VideoStore$Video.class����   4 -   videostore/tema/VideoStore$Video  java/lang/Object title Ljava/lang/String; 	available Z rating F i I <init> (Ljava/lang/String;)V Code
     ()V	    	   	 
	    	     LineNumberTable LocalVariableTable this "Lvideostore/tema/VideoStore$Video; getName ()Ljava/lang/String; toString
  #    receiveRating (I)V givenRating 
SourceFile VideoStore.java InnerClasses + videostore/tema/VideoStore Video                   	 
                 j     *� *� *� *� *+� *� �              	                                    /     *� �                         !       /     *� "�                          $ %     X     *Y� `� **� �b*� �n� �           # 
 $  %                &    '    ( )   
   * , PK
    sz?N7���
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
    sz?N�D�    (   videostore/tema/VideoStoreLauncher.class����   4   "videostore/tema/VideoStoreLauncher  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this $Lvideostore/tema/VideoStoreLauncher; main ([Ljava/lang/String;)V  videostore/tema/VideoMenu
  	 args [Ljava/lang/String; menu Lvideostore/tema/VideoMenu; 
SourceFile VideoStoreLauncher.java !               3     *� �    
   
                   	       A     	� Y� L�    
   
    
          	               PK   2�AN��                      META-INF/MANIFEST.MF��  PK
 
    2�AN���@   @                a   META-INF/REFACTORINGS.XMLPK
 
    ��AN                         �   testing/PK
 
    ��AN                         �   testing/homework/PK
 
    ��AN��<�   �                -  testing/homework/Matrice.javaPK
 
    �AN��4  4               �  testing/homework/TestTema.javaPK
 
    �ANd+잁  �               X  testing/homework/Metode.javaPK
 
    sz?N3z7{  {  
               .classpathPK
 
    [n.N�r�|  |               �  .projectPK
 
    ��AN^$�%                 X  testing/homework/Matrice.classPK
 
    �AN`�!9
  9
               �  testing/homework/Metode.classPK
 
    �AN��,�  �               $  testing/homework/TestTema.classPK
 
    sz?N                         �!  videostore/PK
 
    sz?N                         "  videostore/tema/PK
 
    sz?N4���  �               :"  videostore/tema/VideoMenu.classPK
 
    sz?N,�r�  �  &             8)  videostore/tema/VideoStore$Video.classPK
 
    sz?N7���
  �
                -  videostore/tema/VideoStore.classPK
 
    sz?N�D�    (             �7  videostore/tema/VideoStoreLauncher.classPK      �  :    