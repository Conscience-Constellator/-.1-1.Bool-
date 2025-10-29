package CC.$.Q$Q;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
//import CC.Util.By.LMNt.Get_Q_By_Bool;
//import CC.$.Q$Q_LMNt.Bool$Q;
//import CC.$.Q$Q_LMNt.Q$Point;
import java.util.Collection;
import static java.lang.reflect.Array.newInstance;

public interface Bool$Point<Out_Typ> //extends Bool$Q,Q$Point<Out_Typ>
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Bool$Point.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	Out_Typ Bool$Point(boolean In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Pointg(boolean[] From,Out_Typ[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Bool$Point(From[IndX]));}}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default <Out extends Out_Typ>Out[] Boolg$Pointg(boolean[] From,Class<Out> Typ)
			{
				Out[] Out=(Out[])newInstance(Typ,From.length);
				Boolg$Pointg(From,Out);

				return Out;
			}
//			@Lin_DclAr @Neds_Ovrid(NEds=No)
//			default Out_Typ[] Boolg$Pointg(boolean[] From){return Boolg$Pointg(From,Get_Out_Typ());}
	@Lin_DclAr @Neds_Ovrid(NEds=No)
	default void Boolg$Pointg(Iterable<Boolean> From,Collection<Out_Typ> To){for(boolean In:From){To.add(Bool$Point(In));}}
}