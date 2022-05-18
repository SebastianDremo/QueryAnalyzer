// Generated from C:/Users/sebas/Projects/QueryAnalyzer/QueryAnalyzer/QueryAnalyzer.Parser/Grammars\SqlParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#tsql_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsql_file(SqlParser.Tsql_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch(SqlParser.BatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#batch_level_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch_level_statement(SqlParser.Batch_level_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clauses(SqlParser.Sql_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dml_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_clause(SqlParser.Dml_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_clause(SqlParser.Ddl_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#backup_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_statement(SqlParser.Backup_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCfl_statement(SqlParser.Cfl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(SqlParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(SqlParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(SqlParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(SqlParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(SqlParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SqlParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(SqlParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#throw_error_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_error_number(SqlParser.Throw_error_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#throw_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_message(SqlParser.Throw_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#throw_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_state(SqlParser.Throw_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#try_catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_statement(SqlParser.Try_catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#waitfor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_statement(SqlParser.Waitfor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(SqlParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(SqlParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseerror_statement(SqlParser.Raiseerror_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#empty_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_statement(SqlParser.Empty_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#another_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnother_statement(SqlParser.Another_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_application_role(SqlParser.Alter_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_application_role(SqlParser.Create_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_aggregate(SqlParser.Drop_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_application_role(SqlParser.Drop_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly(SqlParser.Alter_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_start(SqlParser.Alter_assembly_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_clause(SqlParser.Alter_assembly_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_from_clause(SqlParser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_from_clause_start(SqlParser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_drop_clause(SqlParser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_drop_multiple_files(SqlParser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_drop(SqlParser.Alter_assembly_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_add_clause(SqlParser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_asssembly_add_clause_start(SqlParser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_client_file_clause(SqlParser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_file_name(SqlParser.Alter_assembly_file_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_file_bits(SqlParser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_as(SqlParser.Alter_assembly_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_with_clause(SqlParser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_assembly_with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_with(SqlParser.Alter_assembly_withContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClient_assembly_specifier(SqlParser.Client_assembly_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assembly_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembly_option(SqlParser.Assembly_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#network_file_share}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_file_share(SqlParser.Network_file_shareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#network_computer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_computer(SqlParser.Network_computerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#network_file_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_file_start(SqlParser.Network_file_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_path(SqlParser.File_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_directory_path_separator(SqlParser.File_directory_path_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#local_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_file(SqlParser.Local_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#local_drive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_drive(SqlParser.Local_driveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#multiple_local_files}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_local_files(SqlParser.Multiple_local_filesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_local_file_start(SqlParser.Multiple_local_file_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_assembly(SqlParser.Create_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_assembly(SqlParser.Drop_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_asymmetric_key(SqlParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_asymmetric_key_start(SqlParser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_option(SqlParser.Asymmetric_key_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_option_start(SqlParser.Asymmetric_key_option_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_password_change_option(SqlParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_asymmetric_key(SqlParser.Create_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_asymmetric_key(SqlParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_authorization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization(SqlParser.Alter_authorizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#authorization_grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorization_grantee(SqlParser.Authorization_granteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#entity_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_to(SqlParser.Entity_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colon_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_colon(SqlParser.Colon_colonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_authorization_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_start(SqlParser.Alter_authorization_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_for_sql_database(SqlParser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_for_azure_dw(SqlParser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_for_parallel_dw(SqlParser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(SqlParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_for_sql_database(SqlParser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_for_azure_dw(SqlParser.Class_type_for_azure_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_for_parallel_dw(SqlParser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#class_type_for_grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_for_grant(SqlParser.Class_type_for_grantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_availability_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_availability_group(SqlParser.Drop_availability_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_availability_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group(SqlParser.Alter_availability_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group_start(SqlParser.Alter_availability_group_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group_options(SqlParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ip_v4_failover}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_v4_failover(SqlParser.Ip_v4_failoverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ip_v6_failover}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_v6_failover(SqlParser.Ip_v6_failoverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_broker_priority(SqlParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_broker_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_broker_priority(SqlParser.Drop_broker_priorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_certificate(SqlParser.Alter_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_encryption_key(SqlParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_column_encryption_key(SqlParser.Create_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_certificate(SqlParser.Drop_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_encryption_key(SqlParser.Drop_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_column_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_master_key(SqlParser.Drop_column_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_contract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_contract(SqlParser.Drop_contractContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_credential(SqlParser.Drop_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_cryptograhic_provider(SqlParser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database(SqlParser.Drop_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_audit_specification(SqlParser.Drop_database_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_database_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_encryption_key(SqlParser.Drop_database_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_scoped_credential(SqlParser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_default(SqlParser.Drop_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_endpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_endpoint(SqlParser.Drop_endpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_external_data_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_data_source(SqlParser.Drop_external_data_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_external_file_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_file_format(SqlParser.Drop_external_file_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_library(SqlParser.Drop_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_resource_pool(SqlParser.Drop_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_external_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_table(SqlParser.Drop_external_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_event_notifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_event_notifications(SqlParser.Drop_event_notificationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_event_session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_event_session(SqlParser.Drop_event_sessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_fulltext_catalog(SqlParser.Drop_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_fulltext_index(SqlParser.Drop_fulltext_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_fulltext_stoplist(SqlParser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_login(SqlParser.Drop_loginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_master_key(SqlParser.Drop_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_message_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_message_type(SqlParser.Drop_message_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_partition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_partition_function(SqlParser.Drop_partition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_partition_scheme(SqlParser.Drop_partition_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_queue(SqlParser.Drop_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_remote_service_binding(SqlParser.Drop_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_resource_pool(SqlParser.Drop_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_db_role(SqlParser.Drop_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_route(SqlParser.Drop_routeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_rule(SqlParser.Drop_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_schema(SqlParser.Drop_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_search_property_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_search_property_list(SqlParser.Drop_search_property_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_security_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_security_policy(SqlParser.Drop_security_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence(SqlParser.Drop_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_server_audit(SqlParser.Drop_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_server_audit_specification(SqlParser.Drop_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_server_role(SqlParser.Drop_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_service(SqlParser.Drop_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_signature(SqlParser.Drop_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statistics_name_azure_dw_and_pdw(SqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_symmetric_key(SqlParser.Drop_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_synonym(SqlParser.Drop_synonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_user(SqlParser.Drop_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_workload_group(SqlParser.Drop_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_xml_schema_collection(SqlParser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#disable_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisable_trigger(SqlParser.Disable_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#enable_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_trigger(SqlParser.Enable_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lock_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table(SqlParser.Lock_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#truncate_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_table(SqlParser.Truncate_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_column_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_column_master_key(SqlParser.Create_column_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_credential(SqlParser.Alter_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_credential(SqlParser.Create_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_cryptographic_provider(SqlParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_cryptographic_provider(SqlParser.Create_cryptographic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_event_notification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_event_notification(SqlParser.Create_event_notificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_event_session(SqlParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_expression(SqlParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_factor(SqlParser.Event_session_predicate_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_leaf(SqlParser.Event_session_predicate_leafContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_data_source(SqlParser.Alter_external_data_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_library(SqlParser.Alter_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_library(SqlParser.Create_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_resource_pool(SqlParser.Alter_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_resource_pool(SqlParser.Create_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fulltext_catalog(SqlParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fulltext_catalog(SqlParser.Create_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fulltext_stoplist(SqlParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fulltext_stoplist(SqlParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_login_sql_server(SqlParser.Alter_login_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_sql_server(SqlParser.Create_login_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_login_azure_sql(SqlParser.Alter_login_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_azure_sql(SqlParser.Create_login_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_login_azure_sql_dw_and_pdw(SqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_login_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_pdw(SqlParser.Create_login_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_master_key_sql_server(SqlParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_master_key_sql_server(SqlParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_master_key_azure_sql(SqlParser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_master_key_azure_sql(SqlParser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_message_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_message_type(SqlParser.Alter_message_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_partition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_partition_function(SqlParser.Alter_partition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_partition_scheme(SqlParser.Alter_partition_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_remote_service_binding(SqlParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_remote_service_binding(SqlParser.Create_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_resource_pool(SqlParser.Create_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_resource_governor(SqlParser.Alter_resource_governorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_db_role(SqlParser.Alter_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_db_role(SqlParser.Create_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_route(SqlParser.Create_routeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_rule(SqlParser.Create_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_sql(SqlParser.Alter_schema_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema(SqlParser.Create_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema_azure_sql_dw_and_pdw(SqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_azure_sql_dw_and_pdw(SqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_search_property_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_search_property_list(SqlParser.Create_search_property_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_security_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_security_policy(SqlParser.Create_security_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence(SqlParser.Alter_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence(SqlParser.Create_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_audit(SqlParser.Alter_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_audit(SqlParser.Create_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_audit_specification(SqlParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_audit_specification(SqlParser.Create_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_configuration(SqlParser.Alter_server_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_role(SqlParser.Alter_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_role(SqlParser.Create_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_role_pdw(SqlParser.Alter_server_role_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_service(SqlParser.Alter_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_service(SqlParser.Create_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_service_master_key(SqlParser.Alter_service_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_symmetric_key(SqlParser.Alter_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_synonym(SqlParser.Create_synonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user(SqlParser.Alter_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user(SqlParser.Create_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_azure_sql_dw(SqlParser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_azure_sql(SqlParser.Alter_user_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_workload_group(SqlParser.Alter_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_workload_group(SqlParser.Create_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_xml_schema_collection(SqlParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_partition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_partition_function(SqlParser.Create_partition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_partition_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_partition_scheme(SqlParser.Create_partition_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_queue(SqlParser.Create_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#queue_settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_settings(SqlParser.Queue_settingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_queue(SqlParser.Alter_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#queue_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_action(SqlParser.Queue_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_rebuild_options(SqlParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_contract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_contract(SqlParser.Create_contractContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#conversation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversation_statement(SqlParser.Conversation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#message_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_statement(SqlParser.Message_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(SqlParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#when_matches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_matches(SqlParser.When_matchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_matched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_matched(SqlParser.Merge_matchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_not_matched(SqlParser.Merge_not_matchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(SqlParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement_from(SqlParser.Delete_statement_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(SqlParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement_value(SqlParser.Insert_statement_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#receive_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive_statement(SqlParser.Receive_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_statement_standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement_standalone(SqlParser.Select_statement_standaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(SqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(SqlParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(SqlParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#output_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_clause(SqlParser.Output_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_dml_list_elem(SqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database(SqlParser.Create_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(SqlParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_index(SqlParser.Alter_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rebuild_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRebuild_partition(SqlParser.Rebuild_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_columnstore_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_columnstore_index(SqlParser.Create_columnstore_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_nonclustered_columnstore_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_nonclustered_columnstore_index(SqlParser.Create_nonclustered_columnstore_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_xml_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_xml_index(SqlParser.Create_xml_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_procedure(SqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#as_external_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_external_name(SqlParser.As_external_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_trigger(SqlParser.Create_or_alter_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_dml_trigger(SqlParser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dml_trigger_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_trigger_option(SqlParser.Dml_trigger_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_trigger_operation(SqlParser.Dml_trigger_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_ddl_trigger(SqlParser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_trigger_operation(SqlParser.Ddl_trigger_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_function(SqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body_returns_select(SqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body_returns_table(SqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body_returns_scalar(SqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#procedure_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_param(SqlParser.Procedure_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#procedure_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_option(SqlParser.Procedure_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_option(SqlParser.Function_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statistics(SqlParser.Create_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statistics(SqlParser.Update_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(SqlParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_indices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_indices(SqlParser.Table_indicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_options(SqlParser.Table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(SqlParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#view_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_attribute(SqlParser.View_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(SqlParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_partition(SqlParser.Switch_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#low_priority_lock_wait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLow_priority_lock_wait(SqlParser.Low_priority_lock_waitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database(SqlParser.Alter_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#add_or_modify_files}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_or_modify_files(SqlParser.Add_or_modify_filesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filespec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilespec(SqlParser.FilespecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#add_or_modify_filegroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_or_modify_filegroups(SqlParser.Add_or_modify_filegroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#filegroup_updatability_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilegroup_updatability_option(SqlParser.Filegroup_updatability_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_optionspec(SqlParser.Database_optionspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#auto_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_option(SqlParser.Auto_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking_option(SqlParser.Change_tracking_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking_option_list(SqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#containment_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainment_option(SqlParser.Containment_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_option(SqlParser.Cursor_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_endpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_endpoint(SqlParser.Alter_endpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_mirroring_option(SqlParser.Database_mirroring_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mirroring_set_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_set_option(SqlParser.Mirroring_set_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mirroring_partner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_partner(SqlParser.Mirroring_partnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mirroring_witness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_witness(SqlParser.Mirroring_witnessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#witness_partner_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWitness_partner_equal(SqlParser.Witness_partner_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partner_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_option(SqlParser.Partner_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#witness_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWitness_option(SqlParser.Witness_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#witness_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWitness_server(SqlParser.Witness_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partner_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_server(SqlParser.Partner_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_host_port_seperator(SqlParser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_server_tcp_prefix(SqlParser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#port_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_number(SqlParser.Port_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(SqlParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_correlation_optimization_option(SqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_encryption_option(SqlParser.Db_encryption_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#db_state_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_state_option(SqlParser.Db_state_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#db_update_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_update_option(SqlParser.Db_update_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_user_access_option(SqlParser.Db_user_access_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayed_durability_option(SqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#external_access_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_access_option(SqlParser.External_access_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#hadr_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHadr_options(SqlParser.Hadr_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixed_page_allocation_option(SqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterization_option(SqlParser.Parameterization_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#recovery_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecovery_option(SqlParser.Recovery_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_broker_option(SqlParser.Service_broker_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnapshot_option(SqlParser.Snapshot_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_option(SqlParser.Sql_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_recovery_time_option(SqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#termination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermination(SqlParser.TerminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index(SqlParser.Drop_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_relational_or_xml_or_spatial_index(SqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_backward_compatible_index(SqlParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(SqlParser.Drop_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger(SqlParser.Drop_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_dml_trigger(SqlParser.Drop_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_ddl_trigger(SqlParser.Drop_ddl_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function(SqlParser.Drop_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statistics(SqlParser.Drop_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(SqlParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view(SqlParser.Drop_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(SqlParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(SqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function_limited(SqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#openquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenquery(SqlParser.OpenqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opendatasource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpendatasource(SqlParser.OpendatasourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(SqlParser.Declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_declaration(SqlParser.Xml_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_statement(SqlParser.Cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#backup_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_database(SqlParser.Backup_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#backup_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_log(SqlParser.Backup_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#backup_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_certificate(SqlParser.Backup_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#backup_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_master_key(SqlParser.Backup_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_service_master_key(SqlParser.Backup_service_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#kill_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_statement(SqlParser.Kill_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#kill_process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_process(SqlParser.Kill_processContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#kill_query_notification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_query_notification(SqlParser.Kill_query_notificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#kill_stats_job}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_stats_job(SqlParser.Kill_stats_jobContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(SqlParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_body_batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_body_batch(SqlParser.Execute_body_batchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_body(SqlParser.Execute_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement_arg(SqlParser.Execute_statement_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_statement_arg_named}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement_arg_named(SqlParser.Execute_statement_arg_namedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_statement_arg_unnamed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement_arg_unnamed(SqlParser.Execute_statement_arg_unnamedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_parameter(SqlParser.Execute_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_var_string(SqlParser.Execute_var_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#security_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_statement(SqlParser.Security_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#principal_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal_id(SqlParser.Principal_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_certificate(SqlParser.Create_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#existing_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExisting_keys(SqlParser.Existing_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#private_key_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_key_options(SqlParser.Private_key_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generate_new_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_new_keys(SqlParser.Generate_new_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#date_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_options(SqlParser.Date_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#open_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_key(SqlParser.Open_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#close_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_key(SqlParser.Close_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_key(SqlParser.Create_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_options(SqlParser.Key_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#algorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithm(SqlParser.AlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryption_mechanism(SqlParser.Encryption_mechanismContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecryption_mechanism(SqlParser.Decryption_mechanismContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grant_permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_permission(SqlParser.Grant_permissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement(SqlParser.Set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_statement(SqlParser.Transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#go_batch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo_batch_statement(SqlParser.Go_batch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#go_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo_statement(SqlParser.Go_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#use_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_statement(SqlParser.Use_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setuser_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetuser_statement(SqlParser.Setuser_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reconfigure_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReconfigure_statement(SqlParser.Reconfigure_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#shutdown_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShutdown_statement(SqlParser.Shutdown_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#checkpoint_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckpoint_statement(SqlParser.Checkpoint_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dbcc_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbcc_special(SqlParser.Dbcc_specialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dbcc_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbcc_clause(SqlParser.Dbcc_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dbcc_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbcc_command(SqlParser.Dbcc_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dbcc_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbcc_options(SqlParser.Dbcc_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_clause(SqlParser.Execute_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_local(SqlParser.Declare_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_definition(SqlParser.Table_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_type_indices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_indices(SqlParser.Table_type_indicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_type_definition(SqlParser.Xml_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_schema_collection(SqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraints(SqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraint(SqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(SqlParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#materialized_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialized_column_definition(SqlParser.Materialized_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_default_value(SqlParser.Table_constraint_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#on_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete(SqlParser.On_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#on_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_update(SqlParser.On_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_options(SqlParser.Index_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option(SqlParser.Index_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor(SqlParser.Declare_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_set_cursor_common(SqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_set_cursor_common_partial(SqlParser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_cursor(SqlParser.Fetch_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_special(SqlParser.Set_specialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#special_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_list(SqlParser.Special_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_LOCAL_ID(SqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#time_zone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_zone(SqlParser.Time_zoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#primitive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_expression(SqlParser.Primitive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(SqlParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unary_operator_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator_expression(SqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bracket_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(SqlParser.Bracket_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(SqlParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#with_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_expression(SqlParser.With_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_elem(SqlParser.Update_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_elem_merge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_elem_merge(SqlParser.Update_elem_mergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(SqlParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(SqlParser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_union(SqlParser.Sql_unionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(SqlParser.Query_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#top_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_clause(SqlParser.Top_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#top_percent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_percent(SqlParser.Top_percentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#top_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_count(SqlParser.Top_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(SqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_clause(SqlParser.For_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_common_directives(SqlParser.Xml_common_directivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(SqlParser.Order_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#group_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_item(SqlParser.Group_by_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#option_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_clause(SqlParser.Option_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(SqlParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimize_for_arg(SqlParser.Optimize_for_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(SqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#udt_method_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdt_method_arguments(SqlParser.Udt_method_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsterisk(SqlParser.AsteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_elem(SqlParser.Column_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#udt_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdt_elem(SqlParser.Udt_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expression_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_elem(SqlParser.Expression_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elem(SqlParser.Select_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_sources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_sources(SqlParser.Table_sourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source(SqlParser.Table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item_joined(SqlParser.Table_source_item_joinedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_source_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item(SqlParser.Table_source_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#open_xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_xml(SqlParser.Open_xmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#open_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_json(SqlParser.Open_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#json_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_declaration(SqlParser.Json_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#json_column_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_column_declaration(SqlParser.Json_column_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#schema_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_declaration(SqlParser.Schema_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_declaration(SqlParser.Column_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#change_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_table(SqlParser.Change_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#change_table_changes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_table_changes(SqlParser.Change_table_changesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#change_table_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_table_version(SqlParser.Change_table_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_part(SqlParser.Join_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_on}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_on(SqlParser.Join_onContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cross_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_join(SqlParser.Cross_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#apply_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApply_(SqlParser.Apply_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pivot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot(SqlParser.PivotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unpivot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot(SqlParser.UnpivotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause(SqlParser.Pivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause(SqlParser.Unpivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#full_column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name_list(SqlParser.Full_column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_with_hint(SqlParser.Table_name_with_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rowset_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function(SqlParser.Rowset_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bulk_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_option(SqlParser.Bulk_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(SqlParser.Derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRANKING_WINDOWED_FUNC(SqlParser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAGGREGATE_WINDOWED_FUNC(SqlParser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANALYTIC_WINDOWED_FUNC(SqlParser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BUILT_IN_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBUILT_IN_FUNC(SqlParser.BUILT_IN_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCALAR_FUNCTION(SqlParser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FREE_TEXT}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFREE_TEXT(SqlParser.FREE_TEXTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARTITION_FUNC}
	 * labeled alternative in {@link SqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARTITION_FUNC(SqlParser.PARTITION_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_function(SqlParser.Partition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#freetext_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreetext_function(SqlParser.Freetext_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#freetext_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreetext_predicate(SqlParser.Freetext_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBINARY_CHECKSUM(SqlParser.BINARY_CHECKSUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCAST(SqlParser.CASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TRY_CAST}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTRY_CAST(SqlParser.TRY_CASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONVERT(SqlParser.CONVERTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHECKSUM(SqlParser.CHECKSUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOALESCE(SqlParser.COALESCEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCURRENT_TIMESTAMP(SqlParser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCURRENT_USER(SqlParser.CURRENT_USERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATEADD(SqlParser.DATEADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATEDIFF(SqlParser.DATEDIFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATENAME(SqlParser.DATENAMEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATEPART(SqlParser.DATEPARTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGETDATE(SqlParser.GETDATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGETUTCDATE(SqlParser.GETUTCDATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTITY(SqlParser.IDENTITYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMIN_ACTIVE_ROWVERSION(SqlParser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULLIF(SqlParser.NULLIFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTUFF(SqlParser.STUFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSESSION_USER(SqlParser.SESSION_USERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSYSTEM_USER(SqlParser.SYSTEM_USERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code USER}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUSER(SqlParser.USERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitISNULL(SqlParser.ISNULLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXML_DATA_TYPE_FUNC(SqlParser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IIF}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIIF(SqlParser.IIFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRINGAGG}
	 * labeled alternative in {@link SqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRINGAGG(SqlParser.STRINGAGGContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_data_type_methods(SqlParser.Xml_data_type_methodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#value_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_method(SqlParser.Value_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#value_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_call(SqlParser.Value_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_method(SqlParser.Query_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_call(SqlParser.Query_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exist_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExist_method(SqlParser.Exist_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exist_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExist_call(SqlParser.Exist_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#modify_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_method(SqlParser.Modify_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#modify_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_call(SqlParser.Modify_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nodes_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodes_method(SqlParser.Nodes_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_section(SqlParser.Switch_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_search_condition_section(SqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#as_column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_column_alias(SqlParser.As_column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_table_alias(SqlParser.As_table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_table_hints(SqlParser.With_table_hintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_with_table_hints(SqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_hint(SqlParser.Table_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_value(SqlParser.Index_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias_list(SqlParser.Column_alias_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_value_constructor(SqlParser.Table_value_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(SqlParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanking_windowed_function(SqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_windowed_function(SqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalytic_windowed_function(SqlParser.Analytic_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_distinct_expression(SqlParser.All_distinct_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(SqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_range_clause(SqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_extent(SqlParser.Window_frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_bound(SqlParser.Window_frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_preceding(SqlParser.Window_frame_precedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_following(SqlParser.Window_frame_followingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(SqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_filestream_option(SqlParser.Database_filestream_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_file_spec(SqlParser.Database_file_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_group(SqlParser.File_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_spec(SqlParser.File_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#entity_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name(SqlParser.Entity_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generated_column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerated_column_constraint(SqlParser.Generated_column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dynamic_masked_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_masked_column(SqlParser.Dynamic_masked_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name_for_azure_dw(SqlParser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name_for_parallel_dw(SqlParser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#full_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name(SqlParser.Full_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simple_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_name(SqlParser.Simple_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_proc_name_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name_schema(SqlParser.Func_proc_name_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_proc_name_database_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name_database_schema(SqlParser.Func_proc_name_database_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_proc_name_server_database_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name_server_database_schema(SqlParser.Func_proc_name_server_database_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ddl_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_object(SqlParser.Ddl_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#full_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name(SqlParser.Full_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list_with_order(SqlParser.Column_name_list_with_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_name_list(SqlParser.Insert_column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_column_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_id(SqlParser.Insert_column_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(SqlParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(SqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#on_off}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_off(SqlParser.On_offContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#clustered}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustered(SqlParser.ClusteredContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#null_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_notnull(SqlParser.Null_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#null_or_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_or_default(SqlParser.Null_or_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_function_name(SqlParser.Scalar_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_conversation_timer(SqlParser.Begin_conversation_timerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_conversation_dialog(SqlParser.Begin_conversation_dialogContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#contract_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContract_name(SqlParser.Contract_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#service_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_name(SqlParser.Service_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#end_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_conversation(SqlParser.End_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_conversation(SqlParser.Waitfor_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#get_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_conversation(SqlParser.Get_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#queue_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_id(SqlParser.Queue_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#send_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend_conversation(SqlParser.Send_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(SqlParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(SqlParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SqlParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#id_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_(SqlParser.Id_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simple_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_id(SqlParser.Simple_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#id_or_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_or_string(SqlParser.Id_or_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(SqlParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(SqlParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_size(SqlParser.File_sizeContext ctx);
}