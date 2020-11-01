using System;

namespace CarGame
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter car speed 1:");
            int speed1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter car speed 2:");
            int speed2 = Convert.ToInt32(Console.ReadLine());

            if(speed1 > speed2)
            {
                Console.WriteLine("Car 1 wins");
            }
            else
            {
                Console.WriteLine("Car 2 wins");
            }
        }
    }
}
