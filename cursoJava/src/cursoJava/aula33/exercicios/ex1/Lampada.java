package cursoJava.aula33.exercicios.ex1;

public class Lampada {
	private String modelo;
	private String tipoLuz;
	private int potenciaWatts;
	private String baseLampada;
	private String corLuz;
	private boolean luz;
	
	Lampada() {  }
	
	Lampada(boolean luz){
		this.luz = luz;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getPotenciaWatts() {
		return potenciaWatts;
	}
	public void setPotenciaWatts(int potenciaWatts) {
		this.potenciaWatts = potenciaWatts;
	}
	public String getBaseLampada() {
		return baseLampada;
	}
	public void setBaseLampada(String baseLampada) {
		this.baseLampada = baseLampada;
	}
	public String getCorLuz() {
		return corLuz;
	}
	public void setCorLuz(String corLuz) {
		this.corLuz = corLuz;
	}
	public boolean isLuz() {
		return luz;
	}
	public void setLuz(boolean luz) {
		this.luz = luz;
	}
	
	public boolean desligar_ligarLamp(Lampada lamp, int escolha) {
		if(escolha == 0) {
			return false;
		}
		else if(escolha == 1) {
			return true;
		}
		else {
			if(lamp.luz == true) {
				System.out.println("Comando invalido!");
				return true;
			}
			else {
				System.out.println("Comando invalido!");
				return false;
			}
				
		}
	}
	
	
}
