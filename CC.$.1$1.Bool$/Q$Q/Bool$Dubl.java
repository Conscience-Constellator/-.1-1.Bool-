package CC.$.Q$Q;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
//import CC.$.Q$Q_LMNt.Bool$Q;
//import CC.$.Q$Q_LMNt.Q$Dubl;
import java.util.Collection;

public interface Bool$Dubl //extends Bool$Q,Q$Dubl
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Bool$Dubl.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	double Bool$Dubl(boolean In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Dublg(boolean[] From,double[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Bool$Dubl(From[IndX]));}}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default double[] Boolg$Dublg(boolean[] In)
			{
				double[] Out=new double[In.length];
				Boolg$Dublg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Dublg(Iterable<Boolean> From,Collection<Double> To){for(boolean In:From){To.add(Bool$Dubl(In));}}
}