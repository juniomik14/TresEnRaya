/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Administrador
 */
public class EnRayaModelo {
   
private int turno=1;
private String marca_X = "X";
private String marca_O = "O";
private boolean error = false;
private int ganador; //1=>jugador1 2=>jugador2 3=>Empate

private String tablero[][] = {{"","",""},
			      {"","",""},
			      {"","",""}
		             };

public void reset(){
	for ( int i = 0; i < tablero.length ; i++ )
		for (int j = 0 ; j < tablero.length ; j++)
			tablero[i][j]="";
	this.error = false;
	this.ganador = 0;
	this.turno = 1;
}

public String setMovimiento(int posicion){
	String out ="";
	out = marcar(posicion, (turno==1) ?this.marca_X:this.marca_O);

	if(checkGanador(this.marca_X)) this.ganador=1;
	else if (checkGanador(this.marca_O)) this.ganador=2;
	else if (isFinJuego()) this.ganador=3;

	changeTurno();
	return out;
	
}
private void changeTurno(){

	turno = (turno==1)?2:1;
	System.out.println("Se cambia turno, "+get_turno());

}
private String marcar(int posicion, String value){
	String marca="";
	switch (posicion){
		case 1:marca = sub_marcar (0,0,value); break;
		case 2:marca = sub_marcar (0,1,value); break;
		case 3:marca = sub_marcar (0,2,value); break;
		case 4:marca = sub_marcar (1,0,value); break;
		case 5:marca = sub_marcar (1,1,value); break;
		case 6:marca = sub_marcar (1,2,value); break;
		case 7:marca = sub_marcar (2,0,value); break;
		case 8:marca = sub_marcar (2,1,value); break;
		case 9:marca = sub_marcar (2,2,value); break;

	}
	return marca
		;
}

private String sub_marcar (int x , int y , String value){
String marca="";
this.error=false;

if(this.tablero[x][y].equals("") ){
	this.tablero[x][y]=value;
	marca = value;
	

	
}else{
marca = this.tablero[x][y];
this.error=true;
}
	return marca;
}

public boolean isError() {return error;}
public int getGanador() {return ganador;}
public String get_turno(){return (this.turno==1)? "Turno: X" : "Turno: O";}

public boolean checkGanador(String marca){
for (int i=0; i < tablero.length ; i++)
{
byte count=0;
	for(int j=0; j < tablero.length; j++)
		count+=(tablero[i][j].equals(marca) )?1:0;
	if( count==3)
		return true;

}
for (int j =0; j < tablero.length; j++)
{
byte count=0;
	for (int i=0; i < tablero.length; i++)
		count+=(tablero[i][j].equals(marca) )?1:0;
	if(count==3)
		return true;
}
if(tablero[0][0].equals(marca) && tablero[1][1].equals(marca) && tablero[2][2].equals(marca) )
	return true;

if(tablero[0][2].equals(marca) && tablero[1][1].equals(marca) && tablero[2][0].equals(marca) )
	return true;

	return false;
}

private boolean isFinJuego(){
	for(int i =0; i < tablero.length; i++){
		for(int j=0; j < tablero.length; j++){
			if(tablero[i][j].equals("")){return false;}
		}}
	return true;
}

}
