using Antlr4.Runtime.Tree;
using Antlr4.Runtime.Misc;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculadora
{
    internal class MyVisitor : CalculadoraBaseVisitor<Double>
    {
        private Dictionary<String, Double> variables = new(); 
        public override Double VisitProg([NotNull] CalculadoraParser.ProgContext context) 
        {
            Double resultado = 0.0;
            foreach(CalculadoraParser.ExprContext expr in context.expr())
            {
                resultado = Visit(expr);
                Console.WriteLine("Resultado: " + resultado);
            }
            return resultado; 
        }

        public override Double VisitMulExpr([NotNull] CalculadoraParser.MulExprContext context) 
        {
            Double izq = Visit(context.expr(0));
            Double der = Visit(context.expr(1));
            return izq * der; 
        }

        public override Double VisitPowerExpr([NotNull] CalculadoraParser.PowerExprContext context) 
        {
            Double izq = Visit(context.expr(0));
            Double der = Visit(context.expr(1));
            return Math.Pow(izq, der);
        }

        public override Double VisitDivExpr([NotNull] CalculadoraParser.DivExprContext context) 
        {
            Double izq = Visit(context.expr(0));
            Double der = Visit(context.expr(1));
            return izq / der;
        }

        public override Double VisitNumberExpr([NotNull] CalculadoraParser.NumberExprContext context) 
        { 
            return Double.Parse(context.NUM().GetText()); 
        }

        public override Double VisitSubExpr([NotNull] CalculadoraParser.SubExprContext context) 
        {
            Double izq = Visit(context.expr(0));
            Double der = Visit(context.expr(1));
            return izq - der;
        }

        public override Double VisitLogExpr([NotNull] CalculadoraParser.LogExprContext context) 
        {
            Double dato = Visit(context.expr());
            return Math.Log(dato);
        }

        public override Double VisitVariableExpr([NotNull] CalculadoraParser.VariableExprContext context) 
        {
            String nombreVariable = context.ID().GetText();
            if (variables.ContainsKey(nombreVariable))
            {
                return variables[nombreVariable];
            }
            else
            {
                Console.Error.WriteLine("Error: Variable '" + nombreVariable + "' no definida.");
                return 0.0;
            }
        }

        public override Double VisitAddExpr([NotNull] CalculadoraParser.AddExprContext context) 
        {
            Double izq = Visit(context.expr(0));
            Double der = Visit(context.expr(1));
            return izq + der;
        }

        public override Double VisitSinExpr([NotNull] CalculadoraParser.SinExprContext context) 
        {
            Double dato = Visit(context.expr());
            return Math.Sin(dato);
        }

        public override Double VisitParenExpr([NotNull] CalculadoraParser.ParenExprContext context) 
        { 
            return Visit(context.expr()); 
        }

        public override Double VisitCosExpr([NotNull] CalculadoraParser.CosExprContext context) 
        {
            Double dato = Visit(context.expr());
            return Math.Cos(dato);
        }

        public override Double VisitAssignExpr([NotNull] CalculadoraParser.AssignExprContext context) 
        {
            String nombreVariable = context.ID().GetText();
            Double valorVariable = Visit(context.expr());
            variables[nombreVariable] = valorVariable;
            return valorVariable;
        }
    }
}

