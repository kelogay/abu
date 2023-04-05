﻿Imports System.Data.OleDb

Public Class Form1

    Dim con As New OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\Users\jatvi\source\repos\table.accdb")
    Dim cmd As New OleDbCommand
    Dim ad As New OleDbDataAdapter
    Dim ds As New DataSet

    Sub display()

        con.Open()
        cmd.CommandText = "select * from studentTable"
        cmd.Connection = con
        ad.SelectCommand = cmd
        cmd.ExecuteNonQuery()

        ds.Clear()

        ad.Fill(ds, 0)
        DataGridView1.DataSource = ds.Tables(0)
        con.Close()
    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        display()

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        con.Open()
        cmd.CommandText = "insert into studentTable values(@id,@name,@city,@date)"
        cmd.Parameters.AddWithValue("@id", Val(TextBox1.Text))
        cmd.Parameters.AddWithValue("@name", TextBox2.Text)
        cmd.Parameters.AddWithValue("@city", TextBox3.Text)
        cmd.Parameters.AddWithValue("@date", Val(TextBox4.Text))

        cmd.Connection = con
        ad.SelectCommand = cmd
        cmd.ExecuteNonQuery()

        cmd.Parameters.Clear()

        con.Close()
        display()
    End Sub

    Private Sub DateTimePicker1_ValueChanged(sender As Object, e As EventArgs) Handles DateTimePicker1.ValueChanged

        TextBox4.Text = DateValue(DateTimePicker1.Value)
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

        con.Open()
        cmd.CommandText = "delete from studentTable where sId=" & Val(TextBox1.Text)

        cmd.Connection = con
        ad.SelectCommand = cmd
        cmd.ExecuteNonQuery()

        cmd.Parameters.Clear()

        con.Close()
        display()

    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click

        con.Open()
        cmd.CommandText = "update studentTable set sName=@name,sCity=@city where sId=" & Val(TextBox1.Text)

        cmd.Parameters.AddWithValue("@name", TextBox2.Text)
        cmd.Parameters.AddWithValue("@city", TextBox3.Text)

        cmd.Connection = con
        ad.SelectCommand = cmd
        cmd.ExecuteNonQuery()

        con.Close()
        display()
    End Sub
End Class
