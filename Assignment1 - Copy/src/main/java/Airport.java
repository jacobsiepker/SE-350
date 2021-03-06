????   9 @
      java/lang/Object <init> ()V  java/lang/Exception 
 Airport must be non-null
     (Ljava/lang/String;)V
      java/lang/String length ()I  Airport name must be 3 letters.
     charAt (I)C  !Airport name must be capitalized.	      ! Airport name Ljava/lang/String;
  # $ % getClass ()Ljava/lang/Class;
  ' ( ) equals (Ljava/lang/Object;)Z
 + , - . / java/util/Objects hash ([Ljava/lang/Object;)I Code LineNumberTable LocalVariableTable this 	LAirport; StackMapTable 
Exceptions getName ()Ljava/lang/String; toString o Ljava/lang/Object; airport hashCode 
SourceFile Airport.java !         !        0   ?     p*? +? ? Y	? ?+? ? ? Y? ?+? A? 5+? Z? ++? A? !+? Z? +? A? +? Z? ? Y? ?*+? ?    1   .             $  :  N  `  j  o  2       p 3 4     p   !  5    ?      ;	 6       7 8  0   /     *? ?    1        2        3 4    9 8  0   /     *? ?    1        2        3 4    ( )  0   ~     )*+? ?+? *? "+? "? ?+? M*? ,? ? &?    1       #  $  %  & 2        ) 3 4     ) : ;    < 4  5      =   0   9     ? Y*? S? *?    1       + 2        3 4    >    ?