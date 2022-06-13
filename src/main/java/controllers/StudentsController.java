package controllers;

import db.DBManager;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

@WebServlet(name="StudentsController", urlPatterns = "/students")

public class StudentsController extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Student> students = DBManager.getAllActiveStudent();



        req.setAttribute("students", students);
        req.getRequestDispatcher("WEB-INF/jsp/students.jsp").forward(req, resp);

    }
}
