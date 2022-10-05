package computerStore;

public class Main {

	public static void main(String[] args) {
		GraphicCard gk1=new GraphicCard();
		gk1.name="Nvidia rtx 3060";
		gk1.memory=16;
		gk1.bit=256;
		gk1.marka="Nvidia";
		gk1.hdmi=true;
		gk1.vga=false;
		GraphicCard gk2=new GraphicCard();
		gk2.name="GeForce gtx 1050";
		gk2.memory=32;
		gk2.bit=384;
		gk2.marka="GeForce"	;
		gk2.hdmi=true;
		gk2.vga=true;
		
		
        gk1.printHdmi();
        gk1.printInfo();
        gk2.printInfo();
        gk2.printHdmi();
        
        Processor i1=new Processor(); 
        i1.marka="intel core i7 10700 ";
        i1.cekirdek=8;
        i1.ips=16;
        i1.mtf=4.80;      
        i1.printLow();
        
	}

}











