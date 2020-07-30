package com.validatedmail.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.validatedmail.pojo.ConfirmationToken;
@Repository/*("confirmationTokenRepository")*/
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, String> {
    ConfirmationToken findByConfirmationToken(String confirmationToken);
}
