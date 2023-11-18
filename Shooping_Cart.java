/*Shooping Cart Problem*/
public class Shooping_Cart
{
    public static void main(String[] args)
    {
        String product[]={"Leather Wallet","Umbrella","Cigarette","Honey"};
        int price[]={1100,900,200,100};
        int gst[]={18,12,28,0};
        int qty[]={1,4,3,2};
        float gst_amount[]=new float[4];
        int total=0;
        int i;
        float max_gst;
        String max_gst_product;
        double paid_amount;
        for(i=0;i<4;i++)
        {
            gst_amount[i]=price[i]*qty[i]+(gst[i]/100);
            total+=price[i]*qty[i];
        }

        max_gst=gst_amount[0];
        max_gst_product=product[0];
        for(i=0;i<4;i++)
        {
            if(gst_amount[i]>max_gst)
            {
                max_gst=gst_amount[i];
                max_gst_product=product[i];
            }
        }

        if(total>=500)
        {
            paid_amount=total-(total*0.05);
        }

        else
        {
            paid_amount=total;
        }

        System.out.println("The Maximum GST Amount Paid Product is: "+max_gst_product);
        System.out.println("The Total Amount to be Paid to the Shop-Keeper is: "+paid_amount);
    }
}