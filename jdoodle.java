public ResultSet getUserData(ServletRequest req, Connection con) throws SQLException {
    // Source of data from HTTP request in servlet
    String accountNumber = req.getParameter("accountNumber");

    String query = "SELECT * FROM user_data WHERE userid = ?";
    PreparedStatement statement = con.prepareStatement(query);
    statement.setString(1, accountNumber);

    // Execute the query
    ResultSet results = statement.executeQuery();
    return results;
}
