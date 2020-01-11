int beer=99;
for(int i=0;i<98;i++){
  println(beer + " bottles of beer on the wall," + (beer) + " bottles of beer. Take one down and pass it around," + (beer-1) + " bottles of beer on the wall.");
beer = beer-1;
}
println("1 bottle of beer on the wall, 1 bottle of beer. Take one down and pass it around, no more bottles of beer on the wall.");
println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");
