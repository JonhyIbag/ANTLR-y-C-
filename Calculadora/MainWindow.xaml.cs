using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Calculadora
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void EventBtnCalcular(object sender, RoutedEventArgs e)
        {
            String operacion = this.TxtOperacion.Text;
            Double resultado = -1.0;
            try
            {
                StringBuilder text = new StringBuilder();
                Console.WriteLine("Input the chat.");


                AntlrInputStream inputStream = new AntlrInputStream(operacion);
                CalculadoraLexer lexer = new CalculadoraLexer(inputStream);
                CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
                CalculadoraParser parser = new CalculadoraParser(commonTokenStream);

                CalculadoraParser.ProgContext context = parser.prog();
                MyVisitor visitor = new MyVisitor();
                resultado = visitor.Visit(context);
                Console.WriteLine("Resultado: " + resultado);
                this.TxtResultado.Text = resultado.ToString();
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex);
            }
        }

        private void EventTxtOperacion(object sender, MouseButtonEventArgs e)
        {
            this.TxtOperacion.Clear();
        }
    }
}