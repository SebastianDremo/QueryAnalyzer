// Generated from C:/Users/sebas/Projects/QueryAnalyzer/QueryAnalyzer/QueryAnalyzer.Parser/Grammars\SqlParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void enterTsql_file(SqlParser.Tsql_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void exitTsql_file(SqlParser.Tsql_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#batch}.
	 * @param ctx the parse tree
	 */
	void enterBatch(SqlParser.BatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#batch}.
	 * @param ctx the parse tree
	 */
	void exitBatch(SqlParser.BatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#batch_level_statement}.
	 * @param ctx the parse tree
	 */
	void enterBatch_level_statement(SqlParser.Batch_level_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#batch_level_statement}.
	 * @param ctx the parse tree
	 */
	void exitBatch_level_statement(SqlParser.Batch_level_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSql_clauses(SqlParser.Sql_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSql_clauses(SqlParser.Sql_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_clause(SqlParser.Dml_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_clause(SqlParser.Dml_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void enterDdl_clause(SqlParser.Ddl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void exitDdl_clause(SqlParser.Ddl_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#backup_statement}.
	 * @param ctx the parse tree
	 */
	void enterBackup_statement(SqlParser.Backup_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#backup_statement}.
	 * @param ctx the parse tree
	 */
	void exitBackup_statement(SqlParser.Backup_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterCfl_statement(SqlParser.Cfl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitCfl_statement(SqlParser.Cfl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(SqlParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(SqlParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(SqlParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(SqlParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(SqlParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(SqlParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(SqlParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(SqlParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(SqlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(SqlParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SqlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SqlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(SqlParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(SqlParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#throw_error_number}.
	 * @param ctx the parse tree
	 */
	void enterThrow_error_number(SqlParser.Throw_error_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#throw_error_number}.
	 * @param ctx the parse tree
	 */
	void exitThrow_error_number(SqlParser.Throw_error_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#throw_message}.
	 * @param ctx the parse tree
	 */
	void enterThrow_message(SqlParser.Throw_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#throw_message}.
	 * @param ctx the parse tree
	 */
	void exitThrow_message(SqlParser.Throw_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#throw_state}.
	 * @param ctx the parse tree
	 */
	void enterThrow_state(SqlParser.Throw_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#throw_state}.
	 * @param ctx the parse tree
	 */
	void exitThrow_state(SqlParser.Throw_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_statement(SqlParser.Try_catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_statement(SqlParser.Try_catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#waitfor_statement}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_statement(SqlParser.Waitfor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#waitfor_statement}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_statement(SqlParser.Waitfor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(SqlParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(SqlParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(SqlParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(SqlParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseerror_statement(SqlParser.Raiseerror_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseerror_statement(SqlParser.Raiseerror_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(SqlParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(SqlParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void enterAnother_statement(SqlParser.Another_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void exitAnother_statement(SqlParser.Another_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_application_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_application_role(SqlParser.Alter_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_application_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_application_role(SqlParser.Alter_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_application_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_application_role(SqlParser.Create_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_application_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_application_role(SqlParser.Create_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterDrop_aggregate(SqlParser.Drop_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitDrop_aggregate(SqlParser.Drop_aggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_application_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_application_role(SqlParser.Drop_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_application_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_application_role(SqlParser.Drop_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly(SqlParser.Alter_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly(SqlParser.Alter_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_start(SqlParser.Alter_assembly_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_start(SqlParser.Alter_assembly_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_clause(SqlParser.Alter_assembly_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_clause(SqlParser.Alter_assembly_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_from_clause(SqlParser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_from_clause(SqlParser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_from_clause_start(SqlParser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_from_clause_start(SqlParser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop_clause(SqlParser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop_clause(SqlParser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop_multiple_files(SqlParser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop_multiple_files(SqlParser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop(SqlParser.Alter_assembly_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop(SqlParser.Alter_assembly_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_add_clause(SqlParser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_add_clause(SqlParser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asssembly_add_clause_start(SqlParser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asssembly_add_clause_start(SqlParser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_client_file_clause(SqlParser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_client_file_clause(SqlParser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_file_name(SqlParser.Alter_assembly_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_file_name(SqlParser.Alter_assembly_file_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_file_bits(SqlParser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_file_bits(SqlParser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_as}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_as(SqlParser.Alter_assembly_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_as}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_as(SqlParser.Alter_assembly_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_with_clause(SqlParser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_with_clause(SqlParser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_assembly_with}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_with(SqlParser.Alter_assembly_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_assembly_with}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_with(SqlParser.Alter_assembly_withContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 */
	void enterClient_assembly_specifier(SqlParser.Client_assembly_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 */
	void exitClient_assembly_specifier(SqlParser.Client_assembly_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assembly_option}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_option(SqlParser.Assembly_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assembly_option}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_option(SqlParser.Assembly_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#network_file_share}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_file_share(SqlParser.Network_file_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#network_file_share}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_file_share(SqlParser.Network_file_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#network_computer}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_computer(SqlParser.Network_computerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#network_computer}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_computer(SqlParser.Network_computerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#network_file_start}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_file_start(SqlParser.Network_file_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#network_file_start}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_file_start(SqlParser.Network_file_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#file_path}.
	 * @param ctx the parse tree
	 */
	void enterFile_path(SqlParser.File_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#file_path}.
	 * @param ctx the parse tree
	 */
	void exitFile_path(SqlParser.File_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 */
	void enterFile_directory_path_separator(SqlParser.File_directory_path_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 */
	void exitFile_directory_path_separator(SqlParser.File_directory_path_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#local_file}.
	 * @param ctx the parse tree
	 */
	void enterLocal_file(SqlParser.Local_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#local_file}.
	 * @param ctx the parse tree
	 */
	void exitLocal_file(SqlParser.Local_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#local_drive}.
	 * @param ctx the parse tree
	 */
	void enterLocal_drive(SqlParser.Local_driveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#local_drive}.
	 * @param ctx the parse tree
	 */
	void exitLocal_drive(SqlParser.Local_driveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#multiple_local_files}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_local_files(SqlParser.Multiple_local_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#multiple_local_files}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_local_files(SqlParser.Multiple_local_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_local_file_start(SqlParser.Multiple_local_file_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_local_file_start(SqlParser.Multiple_local_file_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_assembly}.
	 * @param ctx the parse tree
	 */
	void enterCreate_assembly(SqlParser.Create_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_assembly}.
	 * @param ctx the parse tree
	 */
	void exitCreate_assembly(SqlParser.Create_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_assembly}.
	 * @param ctx the parse tree
	 */
	void enterDrop_assembly(SqlParser.Drop_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_assembly}.
	 * @param ctx the parse tree
	 */
	void exitDrop_assembly(SqlParser.Drop_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asymmetric_key(SqlParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asymmetric_key(SqlParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asymmetric_key_start(SqlParser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asymmetric_key_start(SqlParser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_option(SqlParser.Asymmetric_key_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_option(SqlParser.Asymmetric_key_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_option_start(SqlParser.Asymmetric_key_option_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_option_start(SqlParser.Asymmetric_key_option_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_password_change_option(SqlParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_password_change_option(SqlParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_asymmetric_key(SqlParser.Create_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_asymmetric_key(SqlParser.Create_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_asymmetric_key(SqlParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_asymmetric_key(SqlParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_authorization}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization(SqlParser.Alter_authorizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_authorization}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization(SqlParser.Alter_authorizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#authorization_grantee}.
	 * @param ctx the parse tree
	 */
	void enterAuthorization_grantee(SqlParser.Authorization_granteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#authorization_grantee}.
	 * @param ctx the parse tree
	 */
	void exitAuthorization_grantee(SqlParser.Authorization_granteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#entity_to}.
	 * @param ctx the parse tree
	 */
	void enterEntity_to(SqlParser.Entity_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#entity_to}.
	 * @param ctx the parse tree
	 */
	void exitEntity_to(SqlParser.Entity_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#colon_colon}.
	 * @param ctx the parse tree
	 */
	void enterColon_colon(SqlParser.Colon_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#colon_colon}.
	 * @param ctx the parse tree
	 */
	void exitColon_colon(SqlParser.Colon_colonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_authorization_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_start(SqlParser.Alter_authorization_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_authorization_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_start(SqlParser.Alter_authorization_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_sql_database(SqlParser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_sql_database(SqlParser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_azure_dw(SqlParser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_azure_dw(SqlParser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_parallel_dw(SqlParser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_parallel_dw(SqlParser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(SqlParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(SqlParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_sql_database(SqlParser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_sql_database(SqlParser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_azure_dw(SqlParser.Class_type_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_azure_dw(SqlParser.Class_type_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_parallel_dw(SqlParser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_parallel_dw(SqlParser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#class_type_for_grant}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_grant(SqlParser.Class_type_for_grantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#class_type_for_grant}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_grant(SqlParser.Class_type_for_grantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_availability_group}.
	 * @param ctx the parse tree
	 */
	void enterDrop_availability_group(SqlParser.Drop_availability_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_availability_group}.
	 * @param ctx the parse tree
	 */
	void exitDrop_availability_group(SqlParser.Drop_availability_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_availability_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group(SqlParser.Alter_availability_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_availability_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group(SqlParser.Alter_availability_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group_start(SqlParser.Alter_availability_group_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group_start(SqlParser.Alter_availability_group_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group_options(SqlParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group_options(SqlParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ip_v4_failover}.
	 * @param ctx the parse tree
	 */
	void enterIp_v4_failover(SqlParser.Ip_v4_failoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ip_v4_failover}.
	 * @param ctx the parse tree
	 */
	void exitIp_v4_failover(SqlParser.Ip_v4_failoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ip_v6_failover}.
	 * @param ctx the parse tree
	 */
	void enterIp_v6_failover(SqlParser.Ip_v6_failoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ip_v6_failover}.
	 * @param ctx the parse tree
	 */
	void exitIp_v6_failover(SqlParser.Ip_v6_failoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_broker_priority(SqlParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_broker_priority(SqlParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_broker_priority}.
	 * @param ctx the parse tree
	 */
	void enterDrop_broker_priority(SqlParser.Drop_broker_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_broker_priority}.
	 * @param ctx the parse tree
	 */
	void exitDrop_broker_priority(SqlParser.Drop_broker_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_certificate}.
	 * @param ctx the parse tree
	 */
	void enterAlter_certificate(SqlParser.Alter_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_certificate}.
	 * @param ctx the parse tree
	 */
	void exitAlter_certificate(SqlParser.Alter_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_encryption_key(SqlParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_encryption_key(SqlParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_column_encryption_key(SqlParser.Create_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_column_encryption_key(SqlParser.Create_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_certificate}.
	 * @param ctx the parse tree
	 */
	void enterDrop_certificate(SqlParser.Drop_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_certificate}.
	 * @param ctx the parse tree
	 */
	void exitDrop_certificate(SqlParser.Drop_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_encryption_key(SqlParser.Drop_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_encryption_key(SqlParser.Drop_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_column_master_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_master_key(SqlParser.Drop_column_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_column_master_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_master_key(SqlParser.Drop_column_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_contract}.
	 * @param ctx the parse tree
	 */
	void enterDrop_contract(SqlParser.Drop_contractContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_contract}.
	 * @param ctx the parse tree
	 */
	void exitDrop_contract(SqlParser.Drop_contractContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_credential}.
	 * @param ctx the parse tree
	 */
	void enterDrop_credential(SqlParser.Drop_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_credential}.
	 * @param ctx the parse tree
	 */
	void exitDrop_credential(SqlParser.Drop_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 */
	void enterDrop_cryptograhic_provider(SqlParser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 */
	void exitDrop_cryptograhic_provider(SqlParser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database(SqlParser.Drop_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database(SqlParser.Drop_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_audit_specification(SqlParser.Drop_database_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_audit_specification(SqlParser.Drop_database_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_database_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_encryption_key(SqlParser.Drop_database_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_database_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_encryption_key(SqlParser.Drop_database_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_scoped_credential(SqlParser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_scoped_credential(SqlParser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_default}.
	 * @param ctx the parse tree
	 */
	void enterDrop_default(SqlParser.Drop_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_default}.
	 * @param ctx the parse tree
	 */
	void exitDrop_default(SqlParser.Drop_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_endpoint}.
	 * @param ctx the parse tree
	 */
	void enterDrop_endpoint(SqlParser.Drop_endpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_endpoint}.
	 * @param ctx the parse tree
	 */
	void exitDrop_endpoint(SqlParser.Drop_endpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_external_data_source}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_data_source(SqlParser.Drop_external_data_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_external_data_source}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_data_source(SqlParser.Drop_external_data_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_external_file_format}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_file_format(SqlParser.Drop_external_file_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_external_file_format}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_file_format(SqlParser.Drop_external_file_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_external_library}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_library(SqlParser.Drop_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_external_library}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_library(SqlParser.Drop_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_resource_pool(SqlParser.Drop_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_resource_pool(SqlParser.Drop_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_external_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_table(SqlParser.Drop_external_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_external_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_table(SqlParser.Drop_external_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_event_notifications}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_notifications(SqlParser.Drop_event_notificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_event_notifications}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_notifications(SqlParser.Drop_event_notificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_event_session}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_session(SqlParser.Drop_event_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_event_session}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_session(SqlParser.Drop_event_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_catalog(SqlParser.Drop_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_catalog(SqlParser.Drop_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_index(SqlParser.Drop_fulltext_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_index(SqlParser.Drop_fulltext_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_stoplist(SqlParser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_stoplist(SqlParser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_login}.
	 * @param ctx the parse tree
	 */
	void enterDrop_login(SqlParser.Drop_loginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_login}.
	 * @param ctx the parse tree
	 */
	void exitDrop_login(SqlParser.Drop_loginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_master_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_master_key(SqlParser.Drop_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_master_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_master_key(SqlParser.Drop_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_message_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_message_type(SqlParser.Drop_message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_message_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_message_type(SqlParser.Drop_message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_partition_function(SqlParser.Drop_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_partition_function(SqlParser.Drop_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterDrop_partition_scheme(SqlParser.Drop_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitDrop_partition_scheme(SqlParser.Drop_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_queue}.
	 * @param ctx the parse tree
	 */
	void enterDrop_queue(SqlParser.Drop_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_queue}.
	 * @param ctx the parse tree
	 */
	void exitDrop_queue(SqlParser.Drop_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterDrop_remote_service_binding(SqlParser.Drop_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitDrop_remote_service_binding(SqlParser.Drop_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterDrop_resource_pool(SqlParser.Drop_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitDrop_resource_pool(SqlParser.Drop_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_db_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_db_role(SqlParser.Drop_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_db_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_db_role(SqlParser.Drop_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_route}.
	 * @param ctx the parse tree
	 */
	void enterDrop_route(SqlParser.Drop_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_route}.
	 * @param ctx the parse tree
	 */
	void exitDrop_route(SqlParser.Drop_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_rule}.
	 * @param ctx the parse tree
	 */
	void enterDrop_rule(SqlParser.Drop_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_rule}.
	 * @param ctx the parse tree
	 */
	void exitDrop_rule(SqlParser.Drop_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_schema}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema(SqlParser.Drop_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_schema}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema(SqlParser.Drop_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_search_property_list}.
	 * @param ctx the parse tree
	 */
	void enterDrop_search_property_list(SqlParser.Drop_search_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_search_property_list}.
	 * @param ctx the parse tree
	 */
	void exitDrop_search_property_list(SqlParser.Drop_search_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_security_policy}.
	 * @param ctx the parse tree
	 */
	void enterDrop_security_policy(SqlParser.Drop_security_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_security_policy}.
	 * @param ctx the parse tree
	 */
	void exitDrop_security_policy(SqlParser.Drop_security_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(SqlParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(SqlParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_audit(SqlParser.Drop_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_audit(SqlParser.Drop_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_audit_specification(SqlParser.Drop_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_audit_specification(SqlParser.Drop_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_server_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_role(SqlParser.Drop_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_server_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_role(SqlParser.Drop_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_service}.
	 * @param ctx the parse tree
	 */
	void enterDrop_service(SqlParser.Drop_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_service}.
	 * @param ctx the parse tree
	 */
	void exitDrop_service(SqlParser.Drop_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_signature}.
	 * @param ctx the parse tree
	 */
	void enterDrop_signature(SqlParser.Drop_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_signature}.
	 * @param ctx the parse tree
	 */
	void exitDrop_signature(SqlParser.Drop_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics_name_azure_dw_and_pdw(SqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics_name_azure_dw_and_pdw(SqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_symmetric_key(SqlParser.Drop_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_symmetric_key(SqlParser.Drop_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_synonym}.
	 * @param ctx the parse tree
	 */
	void enterDrop_synonym(SqlParser.Drop_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_synonym}.
	 * @param ctx the parse tree
	 */
	void exitDrop_synonym(SqlParser.Drop_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_user}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user(SqlParser.Drop_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_user}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user(SqlParser.Drop_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterDrop_workload_group(SqlParser.Drop_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitDrop_workload_group(SqlParser.Drop_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterDrop_xml_schema_collection(SqlParser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitDrop_xml_schema_collection(SqlParser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#disable_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDisable_trigger(SqlParser.Disable_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#disable_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDisable_trigger(SqlParser.Disable_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#enable_trigger}.
	 * @param ctx the parse tree
	 */
	void enterEnable_trigger(SqlParser.Enable_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#enable_trigger}.
	 * @param ctx the parse tree
	 */
	void exitEnable_trigger(SqlParser.Enable_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void enterLock_table(SqlParser.Lock_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void exitLock_table(SqlParser.Lock_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_table(SqlParser.Truncate_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_table(SqlParser.Truncate_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_column_master_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_column_master_key(SqlParser.Create_column_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_column_master_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_column_master_key(SqlParser.Create_column_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_credential}.
	 * @param ctx the parse tree
	 */
	void enterAlter_credential(SqlParser.Alter_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_credential}.
	 * @param ctx the parse tree
	 */
	void exitAlter_credential(SqlParser.Alter_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_credential}.
	 * @param ctx the parse tree
	 */
	void enterCreate_credential(SqlParser.Create_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_credential}.
	 * @param ctx the parse tree
	 */
	void exitCreate_credential(SqlParser.Create_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void enterAlter_cryptographic_provider(SqlParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void exitAlter_cryptographic_provider(SqlParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cryptographic_provider(SqlParser.Create_cryptographic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cryptographic_provider(SqlParser.Create_cryptographic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_event_notification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_notification(SqlParser.Create_event_notificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_event_notification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_notification(SqlParser.Create_event_notificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_event_session(SqlParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_event_session(SqlParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_expression(SqlParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_expression(SqlParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_factor(SqlParser.Event_session_predicate_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_factor(SqlParser.Event_session_predicate_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_leaf(SqlParser.Event_session_predicate_leafContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_leaf(SqlParser.Event_session_predicate_leafContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_data_source(SqlParser.Alter_external_data_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_data_source(SqlParser.Alter_external_data_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_external_library}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_library(SqlParser.Alter_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_external_library}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_library(SqlParser.Alter_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_external_library}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_library(SqlParser.Create_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_external_library}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_library(SqlParser.Create_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_resource_pool(SqlParser.Alter_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_resource_pool(SqlParser.Alter_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_resource_pool(SqlParser.Create_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_resource_pool(SqlParser.Create_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_catalog(SqlParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_catalog(SqlParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_catalog(SqlParser.Create_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_catalog(SqlParser.Create_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_stoplist(SqlParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_stoplist(SqlParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_stoplist(SqlParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_stoplist(SqlParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_sql_server(SqlParser.Alter_login_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_sql_server(SqlParser.Alter_login_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_sql_server(SqlParser.Create_login_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_sql_server(SqlParser.Create_login_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_azure_sql(SqlParser.Alter_login_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_azure_sql(SqlParser.Alter_login_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_azure_sql(SqlParser.Create_login_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_azure_sql(SqlParser.Create_login_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_azure_sql_dw_and_pdw(SqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_azure_sql_dw_and_pdw(SqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_login_pdw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_pdw(SqlParser.Create_login_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_login_pdw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_pdw(SqlParser.Create_login_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterAlter_master_key_sql_server(SqlParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitAlter_master_key_sql_server(SqlParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterCreate_master_key_sql_server(SqlParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitCreate_master_key_sql_server(SqlParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_master_key_azure_sql(SqlParser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_master_key_azure_sql(SqlParser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterCreate_master_key_azure_sql(SqlParser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitCreate_master_key_azure_sql(SqlParser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_message_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_message_type(SqlParser.Alter_message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_message_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_message_type(SqlParser.Alter_message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_function(SqlParser.Alter_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_function(SqlParser.Alter_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_scheme(SqlParser.Alter_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_scheme(SqlParser.Alter_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterAlter_remote_service_binding(SqlParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitAlter_remote_service_binding(SqlParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterCreate_remote_service_binding(SqlParser.Create_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitCreate_remote_service_binding(SqlParser.Create_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterCreate_resource_pool(SqlParser.Create_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitCreate_resource_pool(SqlParser.Create_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 */
	void enterAlter_resource_governor(SqlParser.Alter_resource_governorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 */
	void exitAlter_resource_governor(SqlParser.Alter_resource_governorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_db_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_db_role(SqlParser.Alter_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_db_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_db_role(SqlParser.Alter_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_db_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_db_role(SqlParser.Create_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_db_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_db_role(SqlParser.Create_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_route}.
	 * @param ctx the parse tree
	 */
	void enterCreate_route(SqlParser.Create_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_route}.
	 * @param ctx the parse tree
	 */
	void exitCreate_route(SqlParser.Create_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_rule}.
	 * @param ctx the parse tree
	 */
	void enterCreate_rule(SqlParser.Create_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_rule}.
	 * @param ctx the parse tree
	 */
	void exitCreate_rule(SqlParser.Create_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_sql(SqlParser.Alter_schema_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_sql(SqlParser.Alter_schema_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema(SqlParser.Create_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema(SqlParser.Create_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema_azure_sql_dw_and_pdw(SqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema_azure_sql_dw_and_pdw(SqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_azure_sql_dw_and_pdw(SqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_azure_sql_dw_and_pdw(SqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_search_property_list}.
	 * @param ctx the parse tree
	 */
	void enterCreate_search_property_list(SqlParser.Create_search_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_search_property_list}.
	 * @param ctx the parse tree
	 */
	void exitCreate_search_property_list(SqlParser.Create_search_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_security_policy}.
	 * @param ctx the parse tree
	 */
	void enterCreate_security_policy(SqlParser.Create_security_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_security_policy}.
	 * @param ctx the parse tree
	 */
	void exitCreate_security_policy(SqlParser.Create_security_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(SqlParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(SqlParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(SqlParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(SqlParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_audit(SqlParser.Alter_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_audit(SqlParser.Alter_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_audit(SqlParser.Create_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_audit(SqlParser.Create_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_audit_specification(SqlParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_audit_specification(SqlParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_audit_specification(SqlParser.Create_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_audit_specification(SqlParser.Create_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_configuration(SqlParser.Alter_server_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_configuration(SqlParser.Alter_server_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_server_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_role(SqlParser.Alter_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_server_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_role(SqlParser.Alter_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_server_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_role(SqlParser.Create_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_server_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_role(SqlParser.Create_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_role_pdw(SqlParser.Alter_server_role_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_role_pdw(SqlParser.Alter_server_role_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_service}.
	 * @param ctx the parse tree
	 */
	void enterAlter_service(SqlParser.Alter_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_service}.
	 * @param ctx the parse tree
	 */
	void exitAlter_service(SqlParser.Alter_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_service}.
	 * @param ctx the parse tree
	 */
	void enterCreate_service(SqlParser.Create_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_service}.
	 * @param ctx the parse tree
	 */
	void exitCreate_service(SqlParser.Create_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_service_master_key(SqlParser.Alter_service_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_service_master_key(SqlParser.Alter_service_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_symmetric_key(SqlParser.Alter_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_symmetric_key(SqlParser.Alter_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void enterCreate_synonym(SqlParser.Create_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void exitCreate_synonym(SqlParser.Create_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user(SqlParser.Alter_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user(SqlParser.Alter_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_user}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user(SqlParser.Create_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_user}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user(SqlParser.Create_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_azure_sql_dw(SqlParser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_azure_sql_dw(SqlParser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_azure_sql(SqlParser.Alter_user_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_azure_sql(SqlParser.Alter_user_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_workload_group(SqlParser.Alter_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_workload_group(SqlParser.Alter_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterCreate_workload_group(SqlParser.Create_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitCreate_workload_group(SqlParser.Create_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterCreate_xml_schema_collection(SqlParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitCreate_xml_schema_collection(SqlParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_partition_function(SqlParser.Create_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_partition_function(SqlParser.Create_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterCreate_partition_scheme(SqlParser.Create_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitCreate_partition_scheme(SqlParser.Create_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_queue}.
	 * @param ctx the parse tree
	 */
	void enterCreate_queue(SqlParser.Create_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_queue}.
	 * @param ctx the parse tree
	 */
	void exitCreate_queue(SqlParser.Create_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#queue_settings}.
	 * @param ctx the parse tree
	 */
	void enterQueue_settings(SqlParser.Queue_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#queue_settings}.
	 * @param ctx the parse tree
	 */
	void exitQueue_settings(SqlParser.Queue_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_queue}.
	 * @param ctx the parse tree
	 */
	void enterAlter_queue(SqlParser.Alter_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_queue}.
	 * @param ctx the parse tree
	 */
	void exitAlter_queue(SqlParser.Alter_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#queue_action}.
	 * @param ctx the parse tree
	 */
	void enterQueue_action(SqlParser.Queue_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#queue_action}.
	 * @param ctx the parse tree
	 */
	void exitQueue_action(SqlParser.Queue_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 */
	void enterQueue_rebuild_options(SqlParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 */
	void exitQueue_rebuild_options(SqlParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_contract}.
	 * @param ctx the parse tree
	 */
	void enterCreate_contract(SqlParser.Create_contractContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_contract}.
	 * @param ctx the parse tree
	 */
	void exitCreate_contract(SqlParser.Create_contractContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#conversation_statement}.
	 * @param ctx the parse tree
	 */
	void enterConversation_statement(SqlParser.Conversation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#conversation_statement}.
	 * @param ctx the parse tree
	 */
	void exitConversation_statement(SqlParser.Conversation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#message_statement}.
	 * @param ctx the parse tree
	 */
	void enterMessage_statement(SqlParser.Message_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#message_statement}.
	 * @param ctx the parse tree
	 */
	void exitMessage_statement(SqlParser.Message_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(SqlParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(SqlParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#when_matches}.
	 * @param ctx the parse tree
	 */
	void enterWhen_matches(SqlParser.When_matchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#when_matches}.
	 * @param ctx the parse tree
	 */
	void exitWhen_matches(SqlParser.When_matchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_matched(SqlParser.Merge_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_matched(SqlParser.Merge_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_not_matched(SqlParser.Merge_not_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_not_matched(SqlParser.Merge_not_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(SqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(SqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement_from(SqlParser.Delete_statement_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement_from(SqlParser.Delete_statement_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(SqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(SqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement_value(SqlParser.Insert_statement_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement_value(SqlParser.Insert_statement_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#receive_statement}.
	 * @param ctx the parse tree
	 */
	void enterReceive_statement(SqlParser.Receive_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#receive_statement}.
	 * @param ctx the parse tree
	 */
	void exitReceive_statement(SqlParser.Receive_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_statement_standalone}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement_standalone(SqlParser.Select_statement_standaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_statement_standalone}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement_standalone(SqlParser.Select_statement_standaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(SqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(SqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(SqlParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(SqlParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(SqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(SqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void enterOutput_clause(SqlParser.Output_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void exitOutput_clause(SqlParser.Output_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterOutput_dml_list_elem(SqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitOutput_dml_list_elem(SqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(SqlParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(SqlParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(SqlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(SqlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_index}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index(SqlParser.Alter_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_index}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index(SqlParser.Alter_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rebuild_partition}.
	 * @param ctx the parse tree
	 */
	void enterRebuild_partition(SqlParser.Rebuild_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rebuild_partition}.
	 * @param ctx the parse tree
	 */
	void exitRebuild_partition(SqlParser.Rebuild_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_columnstore_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_columnstore_index(SqlParser.Create_columnstore_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_columnstore_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_columnstore_index(SqlParser.Create_columnstore_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_nonclustered_columnstore_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_nonclustered_columnstore_index(SqlParser.Create_nonclustered_columnstore_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_nonclustered_columnstore_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_nonclustered_columnstore_index(SqlParser.Create_nonclustered_columnstore_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_xml_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_xml_index(SqlParser.Create_xml_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_xml_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_xml_index(SqlParser.Create_xml_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_procedure(SqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_procedure(SqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#as_external_name}.
	 * @param ctx the parse tree
	 */
	void enterAs_external_name(SqlParser.As_external_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#as_external_name}.
	 * @param ctx the parse tree
	 */
	void exitAs_external_name(SqlParser.As_external_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_trigger(SqlParser.Create_or_alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_trigger(SqlParser.Create_or_alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_dml_trigger(SqlParser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_dml_trigger(SqlParser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dml_trigger_option}.
	 * @param ctx the parse tree
	 */
	void enterDml_trigger_option(SqlParser.Dml_trigger_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dml_trigger_option}.
	 * @param ctx the parse tree
	 */
	void exitDml_trigger_option(SqlParser.Dml_trigger_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void enterDml_trigger_operation(SqlParser.Dml_trigger_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void exitDml_trigger_operation(SqlParser.Dml_trigger_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_ddl_trigger(SqlParser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_ddl_trigger(SqlParser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void enterDdl_trigger_operation(SqlParser.Ddl_trigger_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void exitDdl_trigger_operation(SqlParser.Ddl_trigger_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_function(SqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_function(SqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_select(SqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_select(SqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_table(SqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_table(SqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_scalar(SqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_scalar(SqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_param(SqlParser.Procedure_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_param(SqlParser.Procedure_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_option(SqlParser.Procedure_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_option(SqlParser.Procedure_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_option}.
	 * @param ctx the parse tree
	 */
	void enterFunction_option(SqlParser.Function_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_option}.
	 * @param ctx the parse tree
	 */
	void exitFunction_option(SqlParser.Function_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statistics(SqlParser.Create_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statistics(SqlParser.Create_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_statistics}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statistics(SqlParser.Update_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_statistics}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statistics(SqlParser.Update_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(SqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(SqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_indices}.
	 * @param ctx the parse tree
	 */
	void enterTable_indices(SqlParser.Table_indicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_indices}.
	 * @param ctx the parse tree
	 */
	void exitTable_indices(SqlParser.Table_indicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_options}.
	 * @param ctx the parse tree
	 */
	void enterTable_options(SqlParser.Table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_options}.
	 * @param ctx the parse tree
	 */
	void exitTable_options(SqlParser.Table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(SqlParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(SqlParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void enterView_attribute(SqlParser.View_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void exitView_attribute(SqlParser.View_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(SqlParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(SqlParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#switch_partition}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_partition(SqlParser.Switch_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#switch_partition}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_partition(SqlParser.Switch_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#low_priority_lock_wait}.
	 * @param ctx the parse tree
	 */
	void enterLow_priority_lock_wait(SqlParser.Low_priority_lock_waitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#low_priority_lock_wait}.
	 * @param ctx the parse tree
	 */
	void exitLow_priority_lock_wait(SqlParser.Low_priority_lock_waitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(SqlParser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(SqlParser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#add_or_modify_files}.
	 * @param ctx the parse tree
	 */
	void enterAdd_or_modify_files(SqlParser.Add_or_modify_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#add_or_modify_files}.
	 * @param ctx the parse tree
	 */
	void exitAdd_or_modify_files(SqlParser.Add_or_modify_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#filespec}.
	 * @param ctx the parse tree
	 */
	void enterFilespec(SqlParser.FilespecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#filespec}.
	 * @param ctx the parse tree
	 */
	void exitFilespec(SqlParser.FilespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#add_or_modify_filegroups}.
	 * @param ctx the parse tree
	 */
	void enterAdd_or_modify_filegroups(SqlParser.Add_or_modify_filegroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#add_or_modify_filegroups}.
	 * @param ctx the parse tree
	 */
	void exitAdd_or_modify_filegroups(SqlParser.Add_or_modify_filegroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#filegroup_updatability_option}.
	 * @param ctx the parse tree
	 */
	void enterFilegroup_updatability_option(SqlParser.Filegroup_updatability_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#filegroup_updatability_option}.
	 * @param ctx the parse tree
	 */
	void exitFilegroup_updatability_option(SqlParser.Filegroup_updatability_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_optionspec(SqlParser.Database_optionspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_optionspec(SqlParser.Database_optionspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void enterAuto_option(SqlParser.Auto_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void exitAuto_option(SqlParser.Auto_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option(SqlParser.Change_tracking_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option(SqlParser.Change_tracking_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option_list(SqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option_list(SqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void enterContainment_option(SqlParser.Containment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void exitContainment_option(SqlParser.Containment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void enterCursor_option(SqlParser.Cursor_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void exitCursor_option(SqlParser.Cursor_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_endpoint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_endpoint(SqlParser.Alter_endpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_endpoint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_endpoint(SqlParser.Alter_endpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_mirroring_option(SqlParser.Database_mirroring_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_mirroring_option(SqlParser.Database_mirroring_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#mirroring_set_option}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_set_option(SqlParser.Mirroring_set_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#mirroring_set_option}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_set_option(SqlParser.Mirroring_set_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#mirroring_partner}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_partner(SqlParser.Mirroring_partnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#mirroring_partner}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_partner(SqlParser.Mirroring_partnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#mirroring_witness}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_witness(SqlParser.Mirroring_witnessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#mirroring_witness}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_witness(SqlParser.Mirroring_witnessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#witness_partner_equal}.
	 * @param ctx the parse tree
	 */
	void enterWitness_partner_equal(SqlParser.Witness_partner_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#witness_partner_equal}.
	 * @param ctx the parse tree
	 */
	void exitWitness_partner_equal(SqlParser.Witness_partner_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partner_option}.
	 * @param ctx the parse tree
	 */
	void enterPartner_option(SqlParser.Partner_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partner_option}.
	 * @param ctx the parse tree
	 */
	void exitPartner_option(SqlParser.Partner_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#witness_option}.
	 * @param ctx the parse tree
	 */
	void enterWitness_option(SqlParser.Witness_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#witness_option}.
	 * @param ctx the parse tree
	 */
	void exitWitness_option(SqlParser.Witness_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#witness_server}.
	 * @param ctx the parse tree
	 */
	void enterWitness_server(SqlParser.Witness_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#witness_server}.
	 * @param ctx the parse tree
	 */
	void exitWitness_server(SqlParser.Witness_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partner_server}.
	 * @param ctx the parse tree
	 */
	void enterPartner_server(SqlParser.Partner_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partner_server}.
	 * @param ctx the parse tree
	 */
	void exitPartner_server(SqlParser.Partner_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_host_port_seperator(SqlParser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_host_port_seperator(SqlParser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 */
	void enterPartner_server_tcp_prefix(SqlParser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 */
	void exitPartner_server_tcp_prefix(SqlParser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#port_number}.
	 * @param ctx the parse tree
	 */
	void enterPort_number(SqlParser.Port_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#port_number}.
	 * @param ctx the parse tree
	 */
	void exitPort_number(SqlParser.Port_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(SqlParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(SqlParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void enterDate_correlation_optimization_option(SqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void exitDate_correlation_optimization_option(SqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_encryption_option(SqlParser.Db_encryption_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_encryption_option(SqlParser.Db_encryption_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_state_option(SqlParser.Db_state_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_state_option(SqlParser.Db_state_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_update_option(SqlParser.Db_update_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_update_option(SqlParser.Db_update_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_user_access_option(SqlParser.Db_user_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_user_access_option(SqlParser.Db_user_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void enterDelayed_durability_option(SqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void exitDelayed_durability_option(SqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void enterExternal_access_option(SqlParser.External_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void exitExternal_access_option(SqlParser.External_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#hadr_options}.
	 * @param ctx the parse tree
	 */
	void enterHadr_options(SqlParser.Hadr_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#hadr_options}.
	 * @param ctx the parse tree
	 */
	void exitHadr_options(SqlParser.Hadr_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void enterMixed_page_allocation_option(SqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void exitMixed_page_allocation_option(SqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void enterParameterization_option(SqlParser.Parameterization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void exitParameterization_option(SqlParser.Parameterization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void enterRecovery_option(SqlParser.Recovery_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void exitRecovery_option(SqlParser.Recovery_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void enterService_broker_option(SqlParser.Service_broker_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void exitService_broker_option(SqlParser.Service_broker_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void enterSnapshot_option(SqlParser.Snapshot_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void exitSnapshot_option(SqlParser.Snapshot_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void enterSql_option(SqlParser.Sql_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void exitSql_option(SqlParser.Sql_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void enterTarget_recovery_time_option(SqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void exitTarget_recovery_time_option(SqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#termination}.
	 * @param ctx the parse tree
	 */
	void enterTermination(SqlParser.TerminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#termination}.
	 * @param ctx the parse tree
	 */
	void exitTermination(SqlParser.TerminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index(SqlParser.Drop_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index(SqlParser.Drop_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_relational_or_xml_or_spatial_index(SqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_relational_or_xml_or_spatial_index(SqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_backward_compatible_index(SqlParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_backward_compatible_index(SqlParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(SqlParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(SqlParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(SqlParser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(SqlParser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_dml_trigger(SqlParser.Drop_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_dml_trigger(SqlParser.Drop_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_ddl_trigger(SqlParser.Drop_ddl_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_ddl_trigger(SqlParser.Drop_ddl_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(SqlParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(SqlParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics(SqlParser.Drop_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics(SqlParser.Drop_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(SqlParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(SqlParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view(SqlParser.Drop_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view(SqlParser.Drop_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(SqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(SqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(SqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(SqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function_limited(SqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function_limited(SqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void enterOpenquery(SqlParser.OpenqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void exitOpenquery(SqlParser.OpenqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void enterOpendatasource(SqlParser.OpendatasourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void exitOpendatasource(SqlParser.OpendatasourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_statement(SqlParser.Declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_statement(SqlParser.Declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_declaration}.
	 * @param ctx the parse tree
	 */
	void enterXml_declaration(SqlParser.Xml_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_declaration}.
	 * @param ctx the parse tree
	 */
	void exitXml_declaration(SqlParser.Xml_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_statement(SqlParser.Cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_statement(SqlParser.Cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#backup_database}.
	 * @param ctx the parse tree
	 */
	void enterBackup_database(SqlParser.Backup_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#backup_database}.
	 * @param ctx the parse tree
	 */
	void exitBackup_database(SqlParser.Backup_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#backup_log}.
	 * @param ctx the parse tree
	 */
	void enterBackup_log(SqlParser.Backup_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#backup_log}.
	 * @param ctx the parse tree
	 */
	void exitBackup_log(SqlParser.Backup_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#backup_certificate}.
	 * @param ctx the parse tree
	 */
	void enterBackup_certificate(SqlParser.Backup_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#backup_certificate}.
	 * @param ctx the parse tree
	 */
	void exitBackup_certificate(SqlParser.Backup_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#backup_master_key}.
	 * @param ctx the parse tree
	 */
	void enterBackup_master_key(SqlParser.Backup_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#backup_master_key}.
	 * @param ctx the parse tree
	 */
	void exitBackup_master_key(SqlParser.Backup_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 */
	void enterBackup_service_master_key(SqlParser.Backup_service_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 */
	void exitBackup_service_master_key(SqlParser.Backup_service_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#kill_statement}.
	 * @param ctx the parse tree
	 */
	void enterKill_statement(SqlParser.Kill_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#kill_statement}.
	 * @param ctx the parse tree
	 */
	void exitKill_statement(SqlParser.Kill_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#kill_process}.
	 * @param ctx the parse tree
	 */
	void enterKill_process(SqlParser.Kill_processContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#kill_process}.
	 * @param ctx the parse tree
	 */
	void exitKill_process(SqlParser.Kill_processContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#kill_query_notification}.
	 * @param ctx the parse tree
	 */
	void enterKill_query_notification(SqlParser.Kill_query_notificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#kill_query_notification}.
	 * @param ctx the parse tree
	 */
	void exitKill_query_notification(SqlParser.Kill_query_notificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#kill_stats_job}.
	 * @param ctx the parse tree
	 */
	void enterKill_stats_job(SqlParser.Kill_stats_jobContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#kill_stats_job}.
	 * @param ctx the parse tree
	 */
	void exitKill_stats_job(SqlParser.Kill_stats_jobContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(SqlParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(SqlParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_body_batch}.
	 * @param ctx the parse tree
	 */
	void enterExecute_body_batch(SqlParser.Execute_body_batchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_body_batch}.
	 * @param ctx the parse tree
	 */
	void exitExecute_body_batch(SqlParser.Execute_body_batchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_body}.
	 * @param ctx the parse tree
	 */
	void enterExecute_body(SqlParser.Execute_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_body}.
	 * @param ctx the parse tree
	 */
	void exitExecute_body(SqlParser.Execute_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg(SqlParser.Execute_statement_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg(SqlParser.Execute_statement_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_statement_arg_named}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg_named(SqlParser.Execute_statement_arg_namedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_statement_arg_named}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg_named(SqlParser.Execute_statement_arg_namedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_statement_arg_unnamed}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg_unnamed(SqlParser.Execute_statement_arg_unnamedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_statement_arg_unnamed}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg_unnamed(SqlParser.Execute_statement_arg_unnamedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExecute_parameter(SqlParser.Execute_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExecute_parameter(SqlParser.Execute_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void enterExecute_var_string(SqlParser.Execute_var_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void exitExecute_var_string(SqlParser.Execute_var_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_statement(SqlParser.Security_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_statement(SqlParser.Security_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#principal_id}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal_id(SqlParser.Principal_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#principal_id}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal_id(SqlParser.Principal_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_certificate}.
	 * @param ctx the parse tree
	 */
	void enterCreate_certificate(SqlParser.Create_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_certificate}.
	 * @param ctx the parse tree
	 */
	void exitCreate_certificate(SqlParser.Create_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#existing_keys}.
	 * @param ctx the parse tree
	 */
	void enterExisting_keys(SqlParser.Existing_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#existing_keys}.
	 * @param ctx the parse tree
	 */
	void exitExisting_keys(SqlParser.Existing_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#private_key_options}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_key_options(SqlParser.Private_key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#private_key_options}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_key_options(SqlParser.Private_key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#generate_new_keys}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_new_keys(SqlParser.Generate_new_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#generate_new_keys}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_new_keys(SqlParser.Generate_new_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#date_options}.
	 * @param ctx the parse tree
	 */
	void enterDate_options(SqlParser.Date_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#date_options}.
	 * @param ctx the parse tree
	 */
	void exitDate_options(SqlParser.Date_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#open_key}.
	 * @param ctx the parse tree
	 */
	void enterOpen_key(SqlParser.Open_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#open_key}.
	 * @param ctx the parse tree
	 */
	void exitOpen_key(SqlParser.Open_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#close_key}.
	 * @param ctx the parse tree
	 */
	void enterClose_key(SqlParser.Close_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#close_key}.
	 * @param ctx the parse tree
	 */
	void exitClose_key(SqlParser.Close_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_key(SqlParser.Create_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_key(SqlParser.Create_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#key_options}.
	 * @param ctx the parse tree
	 */
	void enterKey_options(SqlParser.Key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#key_options}.
	 * @param ctx the parse tree
	 */
	void exitKey_options(SqlParser.Key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm(SqlParser.AlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm(SqlParser.AlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterEncryption_mechanism(SqlParser.Encryption_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitEncryption_mechanism(SqlParser.Encryption_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterDecryption_mechanism(SqlParser.Decryption_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitDecryption_mechanism(SqlParser.Decryption_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void enterGrant_permission(SqlParser.Grant_permissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void exitGrant_permission(SqlParser.Grant_permissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(SqlParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(SqlParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_statement(SqlParser.Transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_statement(SqlParser.Transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#go_batch_statement}.
	 * @param ctx the parse tree
	 */
	void enterGo_batch_statement(SqlParser.Go_batch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#go_batch_statement}.
	 * @param ctx the parse tree
	 */
	void exitGo_batch_statement(SqlParser.Go_batch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void enterGo_statement(SqlParser.Go_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void exitGo_statement(SqlParser.Go_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_statement(SqlParser.Use_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_statement(SqlParser.Use_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#setuser_statement}.
	 * @param ctx the parse tree
	 */
	void enterSetuser_statement(SqlParser.Setuser_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#setuser_statement}.
	 * @param ctx the parse tree
	 */
	void exitSetuser_statement(SqlParser.Setuser_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#reconfigure_statement}.
	 * @param ctx the parse tree
	 */
	void enterReconfigure_statement(SqlParser.Reconfigure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#reconfigure_statement}.
	 * @param ctx the parse tree
	 */
	void exitReconfigure_statement(SqlParser.Reconfigure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#shutdown_statement}.
	 * @param ctx the parse tree
	 */
	void enterShutdown_statement(SqlParser.Shutdown_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#shutdown_statement}.
	 * @param ctx the parse tree
	 */
	void exitShutdown_statement(SqlParser.Shutdown_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#checkpoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterCheckpoint_statement(SqlParser.Checkpoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#checkpoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitCheckpoint_statement(SqlParser.Checkpoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dbcc_special}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_special(SqlParser.Dbcc_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dbcc_special}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_special(SqlParser.Dbcc_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dbcc_clause}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_clause(SqlParser.Dbcc_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dbcc_clause}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_clause(SqlParser.Dbcc_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dbcc_command}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_command(SqlParser.Dbcc_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dbcc_command}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_command(SqlParser.Dbcc_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dbcc_options}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_options(SqlParser.Dbcc_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dbcc_options}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_options(SqlParser.Dbcc_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void enterExecute_clause(SqlParser.Execute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void exitExecute_clause(SqlParser.Execute_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_local(SqlParser.Declare_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_local(SqlParser.Declare_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_definition(SqlParser.Table_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_definition(SqlParser.Table_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_type_indices}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_indices(SqlParser.Table_type_indicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_type_indices}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_indices(SqlParser.Table_type_indicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterXml_type_definition(SqlParser.Xml_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitXml_type_definition(SqlParser.Xml_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterXml_schema_collection(SqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitXml_schema_collection(SqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraints(SqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraints(SqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraint(SqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraint(SqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(SqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(SqlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#materialized_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterMaterialized_column_definition(SqlParser.Materialized_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#materialized_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitMaterialized_column_definition(SqlParser.Materialized_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_default_value}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_default_value(SqlParser.Table_constraint_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_default_value}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_default_value(SqlParser.Table_constraint_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#on_delete}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete(SqlParser.On_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#on_delete}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete(SqlParser.On_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#on_update}.
	 * @param ctx the parse tree
	 */
	void enterOn_update(SqlParser.On_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#on_update}.
	 * @param ctx the parse tree
	 */
	void exitOn_update(SqlParser.On_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void enterIndex_options(SqlParser.Index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void exitIndex_options(SqlParser.Index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(SqlParser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(SqlParser.Index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor(SqlParser.Declare_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor(SqlParser.Declare_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_set_cursor_common(SqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_set_cursor_common(SqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_set_cursor_common_partial(SqlParser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_set_cursor_common_partial(SqlParser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void enterFetch_cursor(SqlParser.Fetch_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void exitFetch_cursor(SqlParser.Fetch_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_special}.
	 * @param ctx the parse tree
	 */
	void enterSet_special(SqlParser.Set_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_special}.
	 * @param ctx the parse tree
	 */
	void exitSet_special(SqlParser.Set_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#special_list}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_list(SqlParser.Special_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#special_list}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_list(SqlParser.Special_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void enterConstant_LOCAL_ID(SqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void exitConstant_LOCAL_ID(SqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#time_zone}.
	 * @param ctx the parse tree
	 */
	void enterTime_zone(SqlParser.Time_zoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#time_zone}.
	 * @param ctx the parse tree
	 */
	void exitTime_zone(SqlParser.Time_zoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_expression(SqlParser.Primitive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_expression(SqlParser.Primitive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(SqlParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(SqlParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unary_operator_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_expression(SqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unary_operator_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_expression(SqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(SqlParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(SqlParser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(SqlParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(SqlParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void enterWith_expression(SqlParser.With_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void exitWith_expression(SqlParser.With_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_elem(SqlParser.Update_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_elem(SqlParser.Update_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_elem_merge}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_elem_merge(SqlParser.Update_elem_mergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_elem_merge}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_elem_merge(SqlParser.Update_elem_mergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(SqlParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(SqlParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(SqlParser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(SqlParser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_union}.
	 * @param ctx the parse tree
	 */
	void enterSql_union(SqlParser.Sql_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_union}.
	 * @param ctx the parse tree
	 */
	void exitSql_union(SqlParser.Sql_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void enterQuery_specification(SqlParser.Query_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void exitQuery_specification(SqlParser.Query_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void enterTop_clause(SqlParser.Top_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void exitTop_clause(SqlParser.Top_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#top_percent}.
	 * @param ctx the parse tree
	 */
	void enterTop_percent(SqlParser.Top_percentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#top_percent}.
	 * @param ctx the parse tree
	 */
	void exitTop_percent(SqlParser.Top_percentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#top_count}.
	 * @param ctx the parse tree
	 */
	void enterTop_count(SqlParser.Top_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#top_count}.
	 * @param ctx the parse tree
	 */
	void exitTop_count(SqlParser.Top_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(SqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(SqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_clause(SqlParser.For_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_clause(SqlParser.For_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void enterXml_common_directives(SqlParser.Xml_common_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void exitXml_common_directives(SqlParser.Xml_common_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(SqlParser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(SqlParser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_item(SqlParser.Group_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_item(SqlParser.Group_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void enterOption_clause(SqlParser.Option_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void exitOption_clause(SqlParser.Option_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(SqlParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(SqlParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void enterOptimize_for_arg(SqlParser.Optimize_for_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void exitOptimize_for_arg(SqlParser.Optimize_for_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(SqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(SqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#udt_method_arguments}.
	 * @param ctx the parse tree
	 */
	void enterUdt_method_arguments(SqlParser.Udt_method_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#udt_method_arguments}.
	 * @param ctx the parse tree
	 */
	void exitUdt_method_arguments(SqlParser.Udt_method_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#asterisk}.
	 * @param ctx the parse tree
	 */
	void enterAsterisk(SqlParser.AsteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#asterisk}.
	 * @param ctx the parse tree
	 */
	void exitAsterisk(SqlParser.AsteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_elem}.
	 * @param ctx the parse tree
	 */
	void enterColumn_elem(SqlParser.Column_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_elem}.
	 * @param ctx the parse tree
	 */
	void exitColumn_elem(SqlParser.Column_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#udt_elem}.
	 * @param ctx the parse tree
	 */
	void enterUdt_elem(SqlParser.Udt_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#udt_elem}.
	 * @param ctx the parse tree
	 */
	void exitUdt_elem(SqlParser.Udt_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expression_elem}.
	 * @param ctx the parse tree
	 */
	void enterExpression_elem(SqlParser.Expression_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expression_elem}.
	 * @param ctx the parse tree
	 */
	void exitExpression_elem(SqlParser.Expression_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elem(SqlParser.Select_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elem(SqlParser.Select_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void enterTable_sources(SqlParser.Table_sourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void exitTable_sources(SqlParser.Table_sourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterTable_source(SqlParser.Table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitTable_source(SqlParser.Table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item_joined(SqlParser.Table_source_item_joinedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item_joined(SqlParser.Table_source_item_joinedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item(SqlParser.Table_source_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item(SqlParser.Table_source_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#open_xml}.
	 * @param ctx the parse tree
	 */
	void enterOpen_xml(SqlParser.Open_xmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#open_xml}.
	 * @param ctx the parse tree
	 */
	void exitOpen_xml(SqlParser.Open_xmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#open_json}.
	 * @param ctx the parse tree
	 */
	void enterOpen_json(SqlParser.Open_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#open_json}.
	 * @param ctx the parse tree
	 */
	void exitOpen_json(SqlParser.Open_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#json_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJson_declaration(SqlParser.Json_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#json_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJson_declaration(SqlParser.Json_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#json_column_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJson_column_declaration(SqlParser.Json_column_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#json_column_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJson_column_declaration(SqlParser.Json_column_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#schema_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSchema_declaration(SqlParser.Schema_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#schema_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSchema_declaration(SqlParser.Schema_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void enterColumn_declaration(SqlParser.Column_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void exitColumn_declaration(SqlParser.Column_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#change_table}.
	 * @param ctx the parse tree
	 */
	void enterChange_table(SqlParser.Change_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#change_table}.
	 * @param ctx the parse tree
	 */
	void exitChange_table(SqlParser.Change_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#change_table_changes}.
	 * @param ctx the parse tree
	 */
	void enterChange_table_changes(SqlParser.Change_table_changesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#change_table_changes}.
	 * @param ctx the parse tree
	 */
	void exitChange_table_changes(SqlParser.Change_table_changesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#change_table_version}.
	 * @param ctx the parse tree
	 */
	void enterChange_table_version(SqlParser.Change_table_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#change_table_version}.
	 * @param ctx the parse tree
	 */
	void exitChange_table_version(SqlParser.Change_table_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_part(SqlParser.Join_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_part(SqlParser.Join_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_on}.
	 * @param ctx the parse tree
	 */
	void enterJoin_on(SqlParser.Join_onContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_on}.
	 * @param ctx the parse tree
	 */
	void exitJoin_on(SqlParser.Join_onContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cross_join}.
	 * @param ctx the parse tree
	 */
	void enterCross_join(SqlParser.Cross_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cross_join}.
	 * @param ctx the parse tree
	 */
	void exitCross_join(SqlParser.Cross_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#apply_}.
	 * @param ctx the parse tree
	 */
	void enterApply_(SqlParser.Apply_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#apply_}.
	 * @param ctx the parse tree
	 */
	void exitApply_(SqlParser.Apply_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pivot}.
	 * @param ctx the parse tree
	 */
	void enterPivot(SqlParser.PivotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pivot}.
	 * @param ctx the parse tree
	 */
	void exitPivot(SqlParser.PivotContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unpivot}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot(SqlParser.UnpivotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unpivot}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot(SqlParser.UnpivotContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(SqlParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(SqlParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(SqlParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(SqlParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#full_column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name_list(SqlParser.Full_column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#full_column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name_list(SqlParser.Full_column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_name_with_hint(SqlParser.Table_name_with_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_name_with_hint(SqlParser.Table_name_with_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function(SqlParser.Rowset_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function(SqlParser.Rowset_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void enterBulk_option(SqlParser.Bulk_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void exitBulk_option(SqlParser.Bulk_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table(SqlParser.Derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table(SqlParser.Derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterRANKING_WINDOWED_FUNC(SqlParser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitRANKING_WINDOWED_FUNC(SqlParser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterAGGREGATE_WINDOWED_FUNC(SqlParser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitAGGREGATE_WINDOWED_FUNC(SqlParser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterANALYTIC_WINDOWED_FUNC(SqlParser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitANALYTIC_WINDOWED_FUNC(SqlParser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BUILT_IN_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterBUILT_IN_FUNC(SqlParser.BUILT_IN_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BUILT_IN_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitBUILT_IN_FUNC(SqlParser.BUILT_IN_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSCALAR_FUNCTION(SqlParser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSCALAR_FUNCTION(SqlParser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FREE_TEXT}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFREE_TEXT(SqlParser.FREE_TEXTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FREE_TEXT}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFREE_TEXT(SqlParser.FREE_TEXTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARTITION_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterPARTITION_FUNC(SqlParser.PARTITION_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARTITION_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitPARTITION_FUNC(SqlParser.PARTITION_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#partition_function}.
	 * @param ctx the parse tree
	 */
	void enterPartition_function(SqlParser.Partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#partition_function}.
	 * @param ctx the parse tree
	 */
	void exitPartition_function(SqlParser.Partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#freetext_function}.
	 * @param ctx the parse tree
	 */
	void enterFreetext_function(SqlParser.Freetext_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#freetext_function}.
	 * @param ctx the parse tree
	 */
	void exitFreetext_function(SqlParser.Freetext_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#freetext_predicate}.
	 * @param ctx the parse tree
	 */
	void enterFreetext_predicate(SqlParser.Freetext_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#freetext_predicate}.
	 * @param ctx the parse tree
	 */
	void exitFreetext_predicate(SqlParser.Freetext_predicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterBINARY_CHECKSUM(SqlParser.BINARY_CHECKSUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitBINARY_CHECKSUM(SqlParser.BINARY_CHECKSUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCAST(SqlParser.CASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCAST(SqlParser.CASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TRY_CAST}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterTRY_CAST(SqlParser.TRY_CASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TRY_CAST}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitTRY_CAST(SqlParser.TRY_CASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCONVERT(SqlParser.CONVERTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCONVERT(SqlParser.CONVERTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCHECKSUM(SqlParser.CHECKSUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCHECKSUM(SqlParser.CHECKSUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCOALESCE(SqlParser.COALESCEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCOALESCE(SqlParser.COALESCEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_TIMESTAMP(SqlParser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_TIMESTAMP(SqlParser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_USER(SqlParser.CURRENT_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_USER(SqlParser.CURRENT_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATEADD(SqlParser.DATEADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATEADD(SqlParser.DATEADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATEDIFF(SqlParser.DATEDIFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATEDIFF(SqlParser.DATEDIFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATENAME(SqlParser.DATENAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATENAME(SqlParser.DATENAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATEPART(SqlParser.DATEPARTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATEPART(SqlParser.DATEPARTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterGETDATE(SqlParser.GETDATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitGETDATE(SqlParser.GETDATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterGETUTCDATE(SqlParser.GETUTCDATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitGETUTCDATE(SqlParser.GETUTCDATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterIDENTITY(SqlParser.IDENTITYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitIDENTITY(SqlParser.IDENTITYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterMIN_ACTIVE_ROWVERSION(SqlParser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitMIN_ACTIVE_ROWVERSION(SqlParser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterNULLIF(SqlParser.NULLIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitNULLIF(SqlParser.NULLIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSTUFF(SqlParser.STUFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSTUFF(SqlParser.STUFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSESSION_USER(SqlParser.SESSION_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSESSION_USER(SqlParser.SESSION_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSYSTEM_USER(SqlParser.SYSTEM_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSYSTEM_USER(SqlParser.SYSTEM_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterUSER(SqlParser.USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitUSER(SqlParser.USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterISNULL(SqlParser.ISNULLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitISNULL(SqlParser.ISNULLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterXML_DATA_TYPE_FUNC(SqlParser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitXML_DATA_TYPE_FUNC(SqlParser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IIF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterIIF(SqlParser.IIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IIF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitIIF(SqlParser.IIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRINGAGG}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSTRINGAGG(SqlParser.STRINGAGGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRINGAGG}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSTRINGAGG(SqlParser.STRINGAGGContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 */
	void enterXml_data_type_methods(SqlParser.Xml_data_type_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 */
	void exitXml_data_type_methods(SqlParser.Xml_data_type_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#value_method}.
	 * @param ctx the parse tree
	 */
	void enterValue_method(SqlParser.Value_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#value_method}.
	 * @param ctx the parse tree
	 */
	void exitValue_method(SqlParser.Value_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#value_call}.
	 * @param ctx the parse tree
	 */
	void enterValue_call(SqlParser.Value_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#value_call}.
	 * @param ctx the parse tree
	 */
	void exitValue_call(SqlParser.Value_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query_method}.
	 * @param ctx the parse tree
	 */
	void enterQuery_method(SqlParser.Query_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query_method}.
	 * @param ctx the parse tree
	 */
	void exitQuery_method(SqlParser.Query_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query_call}.
	 * @param ctx the parse tree
	 */
	void enterQuery_call(SqlParser.Query_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query_call}.
	 * @param ctx the parse tree
	 */
	void exitQuery_call(SqlParser.Query_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exist_method}.
	 * @param ctx the parse tree
	 */
	void enterExist_method(SqlParser.Exist_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exist_method}.
	 * @param ctx the parse tree
	 */
	void exitExist_method(SqlParser.Exist_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exist_call}.
	 * @param ctx the parse tree
	 */
	void enterExist_call(SqlParser.Exist_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exist_call}.
	 * @param ctx the parse tree
	 */
	void exitExist_call(SqlParser.Exist_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#modify_method}.
	 * @param ctx the parse tree
	 */
	void enterModify_method(SqlParser.Modify_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#modify_method}.
	 * @param ctx the parse tree
	 */
	void exitModify_method(SqlParser.Modify_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#modify_call}.
	 * @param ctx the parse tree
	 */
	void enterModify_call(SqlParser.Modify_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#modify_call}.
	 * @param ctx the parse tree
	 */
	void exitModify_call(SqlParser.Modify_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#nodes_method}.
	 * @param ctx the parse tree
	 */
	void enterNodes_method(SqlParser.Nodes_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#nodes_method}.
	 * @param ctx the parse tree
	 */
	void exitNodes_method(SqlParser.Nodes_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(SqlParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(SqlParser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_search_condition_section(SqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_search_condition_section(SqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#as_column_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_column_alias(SqlParser.As_column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#as_column_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_column_alias(SqlParser.As_column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_table_alias(SqlParser.As_table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_table_alias(SqlParser.As_table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterWith_table_hints(SqlParser.With_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitWith_table_hints(SqlParser.With_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterInsert_with_table_hints(SqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitInsert_with_table_hints(SqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_hint(SqlParser.Table_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_hint(SqlParser.Table_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_value(SqlParser.Index_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_value(SqlParser.Index_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias_list(SqlParser.Column_alias_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias_list(SqlParser.Column_alias_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void enterTable_value_constructor(SqlParser.Table_value_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void exitTable_value_constructor(SqlParser.Table_value_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(SqlParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(SqlParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterRanking_windowed_function(SqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitRanking_windowed_function(SqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_windowed_function(SqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_windowed_function(SqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_windowed_function(SqlParser.Analytic_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_windowed_function(SqlParser.Analytic_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void enterAll_distinct_expression(SqlParser.All_distinct_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void exitAll_distinct_expression(SqlParser.All_distinct_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(SqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(SqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_or_range_clause(SqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_or_range_clause(SqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_extent(SqlParser.Window_frame_extentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_extent(SqlParser.Window_frame_extentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_bound(SqlParser.Window_frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_bound(SqlParser.Window_frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_preceding(SqlParser.Window_frame_precedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_preceding(SqlParser.Window_frame_precedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_following(SqlParser.Window_frame_followingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_following(SqlParser.Window_frame_followingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(SqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(SqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_filestream_option(SqlParser.Database_filestream_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_filestream_option(SqlParser.Database_filestream_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_file_spec(SqlParser.Database_file_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_file_spec(SqlParser.Database_file_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#file_group}.
	 * @param ctx the parse tree
	 */
	void enterFile_group(SqlParser.File_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#file_group}.
	 * @param ctx the parse tree
	 */
	void exitFile_group(SqlParser.File_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec(SqlParser.File_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec(SqlParser.File_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#entity_name}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name(SqlParser.Entity_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#entity_name}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name(SqlParser.Entity_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#generated_column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterGenerated_column_constraint(SqlParser.Generated_column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#generated_column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitGenerated_column_constraint(SqlParser.Generated_column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dynamic_masked_column}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_masked_column(SqlParser.Dynamic_masked_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dynamic_masked_column}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_masked_column(SqlParser.Dynamic_masked_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name_for_azure_dw(SqlParser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name_for_azure_dw(SqlParser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name_for_parallel_dw(SqlParser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name_for_parallel_dw(SqlParser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name(SqlParser.Full_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name(SqlParser.Full_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(SqlParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(SqlParser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_proc_name_schema}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name_schema(SqlParser.Func_proc_name_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_proc_name_schema}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name_schema(SqlParser.Func_proc_name_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_proc_name_database_schema}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name_database_schema(SqlParser.Func_proc_name_database_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_proc_name_database_schema}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name_database_schema(SqlParser.Func_proc_name_database_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_proc_name_server_database_schema}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name_server_database_schema(SqlParser.Func_proc_name_server_database_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_proc_name_server_database_schema}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name_server_database_schema(SqlParser.Func_proc_name_server_database_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void enterDdl_object(SqlParser.Ddl_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void exitDdl_object(SqlParser.Ddl_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name(SqlParser.Full_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name(SqlParser.Full_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list_with_order(SqlParser.Column_name_list_with_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list_with_order(SqlParser.Column_name_list_with_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_name_list(SqlParser.Insert_column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_name_list(SqlParser.Insert_column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_column_id}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_id(SqlParser.Insert_column_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_column_id}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_id(SqlParser.Insert_column_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(SqlParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(SqlParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(SqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(SqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void enterOn_off(SqlParser.On_offContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void exitOn_off(SqlParser.On_offContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void enterClustered(SqlParser.ClusteredContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void exitClustered(SqlParser.ClusteredContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_notnull(SqlParser.Null_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_notnull(SqlParser.Null_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#null_or_default}.
	 * @param ctx the parse tree
	 */
	void enterNull_or_default(SqlParser.Null_or_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#null_or_default}.
	 * @param ctx the parse tree
	 */
	void exitNull_or_default(SqlParser.Null_or_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void enterScalar_function_name(SqlParser.Scalar_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void exitScalar_function_name(SqlParser.Scalar_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 */
	void enterBegin_conversation_timer(SqlParser.Begin_conversation_timerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 */
	void exitBegin_conversation_timer(SqlParser.Begin_conversation_timerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 */
	void enterBegin_conversation_dialog(SqlParser.Begin_conversation_dialogContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 */
	void exitBegin_conversation_dialog(SqlParser.Begin_conversation_dialogContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#contract_name}.
	 * @param ctx the parse tree
	 */
	void enterContract_name(SqlParser.Contract_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#contract_name}.
	 * @param ctx the parse tree
	 */
	void exitContract_name(SqlParser.Contract_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#service_name}.
	 * @param ctx the parse tree
	 */
	void enterService_name(SqlParser.Service_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#service_name}.
	 * @param ctx the parse tree
	 */
	void exitService_name(SqlParser.Service_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#end_conversation}.
	 * @param ctx the parse tree
	 */
	void enterEnd_conversation(SqlParser.End_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#end_conversation}.
	 * @param ctx the parse tree
	 */
	void exitEnd_conversation(SqlParser.End_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_conversation(SqlParser.Waitfor_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_conversation(SqlParser.Waitfor_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#get_conversation}.
	 * @param ctx the parse tree
	 */
	void enterGet_conversation(SqlParser.Get_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#get_conversation}.
	 * @param ctx the parse tree
	 */
	void exitGet_conversation(SqlParser.Get_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#queue_id}.
	 * @param ctx the parse tree
	 */
	void enterQueue_id(SqlParser.Queue_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#queue_id}.
	 * @param ctx the parse tree
	 */
	void exitQueue_id(SqlParser.Queue_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#send_conversation}.
	 * @param ctx the parse tree
	 */
	void enterSend_conversation(SqlParser.Send_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#send_conversation}.
	 * @param ctx the parse tree
	 */
	void exitSend_conversation(SqlParser.Send_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(SqlParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(SqlParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(SqlParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(SqlParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(SqlParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(SqlParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#id_}.
	 * @param ctx the parse tree
	 */
	void enterId_(SqlParser.Id_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#id_}.
	 * @param ctx the parse tree
	 */
	void exitId_(SqlParser.Id_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void enterSimple_id(SqlParser.Simple_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void exitSimple_id(SqlParser.Simple_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#id_or_string}.
	 * @param ctx the parse tree
	 */
	void enterId_or_string(SqlParser.Id_or_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#id_or_string}.
	 * @param ctx the parse tree
	 */
	void exitId_or_string(SqlParser.Id_or_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(SqlParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(SqlParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(SqlParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(SqlParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void enterFile_size(SqlParser.File_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void exitFile_size(SqlParser.File_sizeContext ctx);
}