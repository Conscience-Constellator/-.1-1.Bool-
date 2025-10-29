package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.By.LMNt.Get_Q_By_Bool;
//import CC.$.Q$Q_LMNt.Bool$Q;
//import CC.$.Q$Q_LMNt.Q$ChR;
import java.util.Collection;

public interface Bool$ChR //extends
//	Bool$Q,
//	Q$ChR
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Bool$ChR.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	char Bool$ChR(boolean In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$ChRg(boolean[] From,char[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Bool$ChR(From[IndX]));}}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default char[] Boolg$ChRg(boolean[] In)
			{
				char[] Out=new char[In.length];
				Boolg$ChRg(In,Out);

				return Out;
			}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$ChRg(Iterable<Boolean> From,Collection<Character> To){for(boolean In:From){To.add(Bool$ChR(In));}}
}