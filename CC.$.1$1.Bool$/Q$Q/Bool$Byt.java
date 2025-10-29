package CC.$.Q$Q;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import CC.$.Q$Q_LMNt.Bool$Q;
//import CC.$.Q$Q_LMNt.Q$Byt;
import java.util.Collection;

public interface Bool$Byt //extends
//	Bool$Q,
//	Q$Byt
{
//	Clas_Rap Class=Init_StRt_Nd(Bool$Byt.class,
//		Clas_Rap.class
//	);/*Dep ?done*/

	@Lin_DclAr
	byte Bool$Byt(boolean In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Bytg(boolean[] From,byte[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Bool$Byt(From[IndX]));}}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default byte[] Boolg$Bytg(boolean[] In)
			{
				byte[] Out=new byte[In.length];
				Boolg$Bytg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Bytg(Iterable<Boolean> From,Collection<Byte> To){for(boolean In:From){To.add(Bool$Byt(In));}}

	byte
		Of=(byte)0b1000_0000,
		On=(byte)0b1100_0000;
	static boolean Rtrn(byte In){return (In&0b1000_0000)==0b1000_0000;}
	static boolean On(byte In){return (In&0b0100_0000)==0b0100_0000;}
	Bool$Byt
		Of_Of=(In)->{return (In)?0:Of;},
		Of2=Of_Of,
		Of_On=(In)->{return (In)?0:On;},
		On_Of=(In)->{return (In)?Of:0;},
		On_On=(In)->{return (In)?On:0;},
		On2=On_On;
}