package Generlization;

public class FireFox implements Intr {
	public void URL()
	{
		System.out.println(" FireFox URl");
	}
	public void Refresh()
	{
		System.out.println(" FireFox Refresh");
	}
	public void Forward()
	{
		System.out.println(" FireFox Forward");
	}
	public void Backward()
	{
			System.out.println(" FireFox Backward");
	}
	public static void main(String[] args) { 
		Chrome x=new Chrome();
	x.Backward();
	x.Forward();
	x.Refresh();
	x.URL();
		FireFox y= new FireFox();
		y.Backward();
		y.Forward();
		y.Refresh();
		y.URL();
	}
}
