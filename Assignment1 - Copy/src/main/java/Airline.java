????   9 8
      java/lang/Object <init> ()V
  	 
   java/lang/String length ()I  java/lang/Exception  9Airline name must be less than 8 characters and non-null.
     (Ljava/lang/String;)V	      Airline name Ljava/lang/String;
     getClass ()Ljava/lang/Class;
     ! equals (Ljava/lang/Object;)Z
 # $ % & ' java/util/Objects hash ([Ljava/lang/Object;)I Code LineNumberTable LocalVariableTable this 	LAirline; StackMapTable 
Exceptions getName ()Ljava/lang/String; toString o Ljava/lang/Object; airline hashCode 
SourceFile Airline.java !                (   ?     (*? +? +? ? 
+? ? ? Y? ?*+? ?    )            "  '  *       ( + ,     (    -    ?      	 .       / 0  (   /     *? ?    )        *        + ,    1 0  (   /     *? ?    )        *        + ,      !  (   ~     )*+? ?+? *? +? ? ?+? M*? ,? ? ?    )              *        ) + ,     ) 2 3    4 ,  -      5   (   9     ? Y*? S? "?    )       " *        + ,    6    7