package CC.$.Q$Q;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
//import CC.Util.By.LMNt.Get_Q_By_Bool;
//import CC.$.Q$Q_LMNt.Bool$Q;
//import CC.$.Q$Q_LMNt.Q$Long;
import java.util.Collection;

public interface Bool$Long //extends Bool$Q,Q$Long
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Bool$Long.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	long Bool$Long(boolean In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Longg(boolean[] From,long[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Bool$Long(From[IndX]));}}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default long[] Boolg$Longg(boolean[] In)
			{
				long[] Out=new long[In.length];
				Boolg$Longg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Longg(Iterable<Boolean> From,Collection<Long> To){for(boolean In:From){To.add(Bool$Long(In));}}
}