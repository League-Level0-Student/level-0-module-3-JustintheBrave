int target = 500;
int move = 250;
int omove = 750;
int movey = 250;

void setup(){
   size(1000,500); 
}

void draw(){
background(255,255,255);
    
 for(int  i=50; i>=0;i--){
   if(i%2==0){
     noFill();
     ellipse(move,movey,i*10, i*10);
     target=target-50;
      }
      
      else{ 
      noFill();
      ellipse(move,movey,i*10, i*10);
      }
 
 }
 
  for(int  o=50; o>=0;o--){
   if(o%2==0){
     noFill();
     ellipse(omove,movey,o*10, o*10);
     target=target-50;
      }
      
      else{ 
      noFill();
      ellipse(omove,movey,o*10, o*10);
      }
 
 }
 move++;
 omove--;
 
 if(move==750){
  move=250; 
 }
 
  if(omove==250){
  omove=750; 
 }
 
 
}
