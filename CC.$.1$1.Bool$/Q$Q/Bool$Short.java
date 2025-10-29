package CC.$.Q$Q;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
//import CC.$.Q$Q_LMNt.Bool$Q;
//import CC.$.Q$Q_LMNt.Q$Short;
import java.util.Collection;

public interface Bool$Short //extends Bool$Q,Q$Short
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Bool$Short.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	short Bool$Short(boolean In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Shortg(boolean[] From,short[] To)
		{for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Bool$Short(From[IndX]));}}
			default short[] Boolg$Shortg(boolean[] In)
			{
				short[] Out=new short[In.length];
				Boolg$Shortg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Shortg(Iterable<Boolean> From,Collection<Short> To){for(boolean In:From){To.add(Bool$Short(In));}}
}