package com.example.demo;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Calcular", urlPatterns = {"/Calcular"})
public class Calcular extends HttpServlet {

    private static long fatorial(int x) {
        long fat = 1;
        for (int i = x; i > 1; i--) {
            fat = fat * i;
        }
        return fat;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String nValue = request.getParameter("N");
            String kValue = request.getParameter("K");

            if (isNumeric(nValue) && isNumeric(kValue)) {
                int N = Integer.parseInt(nValue);
                int K = Integer.parseInt(kValue);

                long permutacoes = fatorial(N) / fatorial(N - K);
                long combinacoes = fatorial(N) / (fatorial(K) * fatorial(N - K));

                request.setAttribute("permutacoes", permutacoes);
                request.setAttribute("combinacoes", combinacoes);

                request.getRequestDispatcher("resultado.jsp").forward(request, response);
            } else {
                request.setAttribute("erro", "Por favor, insira valores numéricos válidos para N e K.");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } catch (NumberFormatException e) {
            request.setAttribute("erro", "Por favor, insira valores numéricos válidos para N e K.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
